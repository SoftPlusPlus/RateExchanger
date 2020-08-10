package com.softplus.rateexchanger;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;

import com.softplus.rateexchanger.background.CurrencyAsyncTaskLoader;
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
import static com.softplus.rateexchanger.utilities.Constants.setAdditionalCountryContent;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Rate>> {

    private final String LOG_TAG = this.getClass().getSimpleName();

    private List<Rate> rateList;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RateRecyclerAdapter rateRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rateList = new ArrayList<>();

        getLatestRates();

        initRecyclerView();

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycleView);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        rateRecyclerAdapter = new RateRecyclerAdapter(this, rateList);
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
        return new CurrencyAsyncTaskLoader(this, buildURL());
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Rate>> loader, List<Rate> rates) {
        if (rates != null && !rates.isEmpty()) {
            rateList = rates;
            String latestUpdate = rateList.get(0).getLatestDate();
            //tv_latest_update.setText(String.format("%s%s", getString(R.string.up_to_date), latestUpdate));
            rateRecyclerAdapter = new RateRecyclerAdapter(this, rateList);
            recyclerView.setAdapter(rateRecyclerAdapter);
            setAdditionalCountryContent(rateList);
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Rate>> loader) {
    }
}