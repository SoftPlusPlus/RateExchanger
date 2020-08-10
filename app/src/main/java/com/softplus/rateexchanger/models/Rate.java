package com.softplus.rateexchanger.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Rate implements Parcelable {
    private int imageId;
    private String symbol;
    private String currency;
    private String country;
    private String latestDate;
    private String rate;

    public Rate(int imageId, String currency, String country) {
        this.imageId = imageId;
        this.currency = currency;
        this.country = country;
    }

    public Rate(int imageId, String currency, String country, String latestDate, String rate) {
        this.imageId = imageId;
        this.currency = currency;
        this.country = country;
        this.latestDate = latestDate;
        this.rate = rate;
    }

    protected Rate(Parcel in) {
        this.imageId = in.readInt();
        this.currency = in.readString();
        this.country = in.readString();
        this.latestDate = in.readString();
        this.rate = in.readString();
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

    public String getRate() {
        return rate;
    }

    public static final Creator<Rate> CREATOR = new Creator<Rate>() {
        @Override
        public Rate createFromParcel(Parcel in) {
            return new Rate(in);
        }

        @Override
        public Rate[] newArray(int size) {
            return new Rate[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(imageId);
        parcel.writeString(symbol);
        parcel.writeString(currency);
        parcel.writeString(country);
        parcel.writeString(latestDate);
        parcel.writeString(rate);
    }
}
