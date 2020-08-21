package com.softplus.rateexchanger.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.utilities.Constants;

import static com.softplus.rateexchanger.utilities.Constants.Country_map;
import static com.softplus.rateexchanger.utilities.Constants.Currency_map;
import static com.softplus.rateexchanger.utilities.Constants.ImageID_map;

public class Country implements Parcelable {
    private final String LOG_TAG = this.getClass().getName();
    private int imageId;
    private String symbol;
    private String currency;
    private String country;
    private String latestDate;
    private String rate;

    public Country(String _symbol, String _latestDate, String _rate) {
        this.symbol = _symbol;
        this.imageId = (ImageID_map.containsKey(_symbol))? ImageID_map.get(_symbol): R.drawable.image_empty;
        this.currency = (Currency_map.containsKey(_symbol))? Constants.Currency_map.get(_symbol): "";
        this.country = (Country_map.containsKey(_symbol))? Constants.Country_map.get(_symbol): "";
        this.latestDate = _latestDate;
        this.rate = _rate;
    }

    protected Country(Parcel in) {
        this.symbol = in.readString();
        this.latestDate = in.readString();
        this.rate = in.readString();
        this.imageId = ImageID_map.get(this.symbol);
        this.currency = Constants.Currency_map.get(this.symbol);
        this.country = Constants.Country_map.get(this.symbol);
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int CountryResourceId) {
        this.imageId = CountryResourceId;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestDate() {
        return latestDate;
    }

    public void setRate(String _rate) {
        this.rate = _rate;
    }

    public String getRate() {
        return rate;
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(symbol);
        parcel.writeString(latestDate);
        parcel.writeString(rate);
    }
}
