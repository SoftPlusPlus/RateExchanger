package com.softplus.rateexchanger.background;

import android.content.Context;
import android.util.Log;

import com.softplus.rateexchanger.models.Rate;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class CurrencyAsyncTaskLoader extends AsyncTaskLoader<List<Rate>> {
    private final String LOG_TAG = this.getClass().getSimpleName();
    private String url;


    public CurrencyAsyncTaskLoader(@NonNull Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "onStartLoading()");
        forceLoad();
    }

    @Nullable
    @Override
    public List<Rate> loadInBackground() {
        Log.i(LOG_TAG, "loadInBackground()");
        if (url == null)
            return null;

        return FetchRatesData.fetchCurrencyRatesData(url)
    }
}