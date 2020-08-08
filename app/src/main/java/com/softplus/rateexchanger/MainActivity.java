package com.softplus.rateexchanger;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.softplus.rateexchanger.models.Rate;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import static com.softplus.rateexchanger.utilities.Constants.APP_KEY;
import static com.softplus.rateexchanger.utilities.Constants.BASE_URL;
import static com.softplus.rateexchanger.utilities.Constants.LOADER_ID;

public class MainActivity
        extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<List<Rate>> {

    private final String LOG_TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLatestRates();
        //buildURL();
    }

    private String buildURL() {
        Uri baseUri = Uri.parse(BASE_URL);
        Uri.Builder uribuilder = baseUri.buildUpon();
        uribuilder.appendQueryParameter("app_id", APP_KEY);
        Log.i(LOG_TAG, uribuilder.build().toString());
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
        Log.i(LOG_TAG, "onCreateLoader()");
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Rate>> loader, List<Rate> data) {
        Log.i(LOG_TAG, "onLoadFinished");
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Rate>> loader) {
        Log.i(LOG_TAG, "onLoaerReset");
    }
}