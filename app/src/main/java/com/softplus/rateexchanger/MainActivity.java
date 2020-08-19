package com.softplus.rateexchanger;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.softplus.rateexchanger.models.Rate;
import com.softplus.rateexchanger.ui.RateRecyclerAdapter;

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
    //private List<Rate> userCustomerRateList;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RateRecyclerAdapter rateRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initConstantsVariables();
        initVariables();

        //getLatestRates();

        initRecyclerView();
    }

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

    private String buildURL() {
        Uri baseUri = Uri.parse(BASE_URL);
        Uri.Builder uribuilder = baseUri.buildUpon();
        uribuilder.appendQueryParameter("app_id", APP_KEY);
        return uribuilder.build().toString();
    }

    private void getLatestRates() {
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo.isConnected()) {
            LoaderManager.getInstance(this).initLoader(LOADER_ID, null, this);
        }
    }

    @NonNull
    @Override
    public Loader<List<Rate>> onCreateLoader(int id, @Nullable Bundle args) {
        //return new CurrencyAsyncTaskLoader(this, buildURL());
        return null;
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

    public void onAddCountryClick(View view) {
        Intent intent = new Intent(MainActivity.this, AllCountryList.class);
        //intent.putExtra("userCustomerRateList", (ArrayList<Rate>)userCustomerRateList.toString());
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1) {
            String addCountry = data.getStringExtra("AddCountry");
            rateRecyclerAdapter.addCountry(addCountry);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}