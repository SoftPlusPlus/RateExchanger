package com.softplus.rateexchanger.networking;

import android.text.TextUtils;
import android.util.Log;

import com.softplus.rateexchanger.models.Country;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FetchRatesData {

    private static final String LOG_TAG = FetchRatesData.class.getSimpleName();

    private static final String JSON_KEY_DATE = "timestamp";
    private static final String JSON_KEY_RATE = "rates";

    public FetchRatesData() {
    }

    public static List<Country> extractCurrencyRatesFromJson(String json) {
        if (TextUtils.isEmpty(json))
            return null;

        String latestDate;
        List<Country> countryList = new ArrayList<>();

        try {
            JSONObject baseJsonResponse = new JSONObject(json);
            latestDate = baseJsonResponse.getString(JSON_KEY_DATE);
            JSONObject ratesObject = baseJsonResponse.getJSONObject(JSON_KEY_RATE);

            for (Iterator<String> iterator = ratesObject.keys(); iterator.hasNext(); ) {
                String currencySymbol = iterator.next();
                String rate = String.valueOf(ratesObject.get(currencySymbol));

                Log.i(LOG_TAG, "==> " + currencySymbol + " " + rate);

                //Rate currencyRate = new Rate(R.mipmap.ic_launcher_round, currencySymbol, currencySymbol, "Country Name", latestDate, rate);
                Country currencyRate = new Country(currencySymbol, latestDate, rate);
                countryList.add(currencyRate);
            }

        } catch (JSONException e) {
            Log.e(LOG_TAG, "extract currency rates from json error", e);
        }

        return countryList;
    }

    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;

        try {
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000); // milliseconds
            urlConnection.setConnectTimeout(15000); // milliseconds
            urlConnection.connect();

            if (urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            }
            else {
                Log.e(LOG_TAG, "HTTP response code: " + urlConnection.getResponseCode());
            }
        }
        catch (IOException e) {
            Log.e(LOG_TAG, "Http Request error, ", e);
        }
        finally {
            if (urlConnection != null)
                urlConnection.disconnect();

            if (inputStream != null)
                inputStream.close();
        }

        return jsonResponse;
    }

    private static String readFromStream(InputStream inputStream) throws IOException{
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }

        return output.toString();
    }

    private static URL createUrl(String stringUrl) {
        URL url;
        try {
            url = new URL(stringUrl);
        }
        catch (MalformedURLException e) {
            Log.e(LOG_TAG, "creating URL error", e);
            return null;
        }

        return url;
    }

    public static List<Country> fetchCurrencyRatesData(String requestUrl) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        URL url = createUrl(requestUrl);

        String jsonResponse = "";
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return extractCurrencyRatesFromJson(jsonResponse);
    }
}
