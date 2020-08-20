package com.softplus.rateexchanger;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.softplus.rateexchanger.background.CurrencyAsyncTaskLoader;
import com.softplus.rateexchanger.models.Rate;
import com.softplus.rateexchanger.ui.RateRecyclerAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.APP_KEY;
import static com.softplus.rateexchanger.utilities.Constants.BASE_URL;
import static com.softplus.rateexchanger.utilities.Constants.LOADER_ID;
import static com.softplus.rateexchanger.utilities.Constants.initConstantsVariables;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Rate>> {

    private final String LOG_TAG = this.getClass().getSimpleName();

    private List<Rate> rateList;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RateRecyclerAdapter rateRecyclerAdapter;

    // Activity request code
    private static final int REQUEST_ADD_COUNTRY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initConstantsVariables();
        initVariables();

        getLatestRates();

        initRecyclerView();
    }

    /* ==================================== */
    /* ============= init UI ============== */
    /* ==================================== */
    private void initVariables() {
        rateList = new ArrayList<>();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycleView);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        rateRecyclerAdapter = new RateRecyclerAdapter(this);
        recyclerView.setAdapter(rateRecyclerAdapter);
    }

    /* ==================================== */
    /* ========== Loader Manager ========== */
    /* ==================================== */
    @NonNull
    @Override
    public Loader<List<Rate>> onCreateLoader(int id, @Nullable Bundle args) {
        String requestUrl = "";
        Uri baseUri = Uri.parse(BASE_URL);
        Uri.Builder uribuilder = baseUri.buildUpon();
        uribuilder.appendQueryParameter("app_id", APP_KEY);
        requestUrl = uribuilder.build().toString();

        return new CurrencyAsyncTaskLoader(this, requestUrl);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Rate>> loader, List<Rate> rates) {
        /*
        if (rates != null && !rates.isEmpty()) {
            rateList = rates;
            String latestUpdate = rateList.get(0).getLatestDate();
            rateRecyclerAdapter = new RateRecyclerAdapter(this, rateList);
            recyclerView.setAdapter(rateRecyclerAdapter);
        }
        */
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Rate>> loader) {
    }

    /* ==================================== */
    /* ============== Control ============= */
    /* ==================================== */
    private void getLatestRates() {
        if (BuildConfig.DEBUG) {
            // read test data from file
            String jsonString;

            try {
                InputStream is = getAssets().open("test_data.json");

                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();

                jsonString = new String(buffer, "UTF-8");
                Log.i(LOG_TAG, jsonString);

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        else {
            ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

            if (networkInfo.isConnected()) {
                LoaderManager.getInstance(this).initLoader(LOADER_ID, null, this);
            }
        }
    }

    public void onAddCountryClick(View view) {
        Intent intent = new Intent(MainActivity.this, AllCountryList.class);
        startActivityForResult(intent, REQUEST_ADD_COUNTRY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        switch (requestCode) {
            case REQUEST_ADD_COUNTRY:
                String addCountry = data.getStringExtra("AddCountry");
                rateRecyclerAdapter.addCountry(addCountry);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + requestCode);
        }
        
        super.onActivityResult(requestCode, resultCode, data);
    }
}