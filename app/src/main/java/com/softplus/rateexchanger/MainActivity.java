package com.softplus.rateexchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import static com.softplus.rateexchanger.utilities.Constants.APP_KEY;
import static com.softplus.rateexchanger.utilities.Constants.BASE_URL;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getLatestRates();
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

        }
    }
}