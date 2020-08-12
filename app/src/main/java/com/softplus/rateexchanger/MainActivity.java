package com.softplus.rateexchanger;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import static com.softplus.rateexchanger.utilities.Constants.DEFAULT_VIEW_ITEMS;
import static com.softplus.rateexchanger.utilities.Constants.LOADER_ID;
import static com.softplus.rateexchanger.utilities.Constants.initConstantsVariables;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Rate>> {

    private final String LOG_TAG = this.getClass().getSimpleName();

    private List<Rate> rateList;
    private List<Rate> userCustomerRateList;
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

        setRecyclerViewItem();
    }

    private void initVariables() {
        rateList = new ArrayList<>();
        userCustomerRateList = new ArrayList<>();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycleView);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        rateRecyclerAdapter = new RateRecyclerAdapter(this, rateList);
        recyclerView.setAdapter(rateRecyclerAdapter);
    }

    private void setRecyclerViewItem() {
        // Get user preferences
        String customerItems = readCustomerItems();

        // save settings to list
        String list[] = customerItems.split(",");
        for (int i = 0; i < list.length; i++) {
            Rate r = new Rate(list[i], "", "");
            userCustomerRateList.add(r);
        }

        // update UI
        rateRecyclerAdapter = new RateRecyclerAdapter(this, userCustomerRateList);
        recyclerView.setAdapter(rateRecyclerAdapter);
    }

    private String readCustomerItems() {
        // Read preferences settings
        SharedPreferences preferences = getSharedPreferences("UserPreferences", MODE_PRIVATE);
        String customerItems = preferences.getString("customerItems", "");

        if (customerItems.isEmpty()) { // no settings, save default to file
            preferences.edit().putString("customerItems", DEFAULT_VIEW_ITEMS).commit();
            customerItems = DEFAULT_VIEW_ITEMS;
        }

        return customerItems;
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

    public void onAddCountry(View view) {
        Log.i(LOG_TAG, "Add");
    }
}