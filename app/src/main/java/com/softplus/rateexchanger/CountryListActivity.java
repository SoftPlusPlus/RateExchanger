package com.softplus.rateexchanger;

import android.content.Intent;
import android.os.Bundle;

import com.softplus.rateexchanger.models.Rate;
import com.softplus.rateexchanger.ui.RateRecyclerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.Country_map;

public class CountryListActivity extends AppCompatActivity {

    private String LOG_TAG = this.getClass().getSimpleName();
    private List<Rate> userCustomerRateList;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RateRecyclerAdapter rateRecyclerAdapter;
    private List<Rate> allCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        allCountryList = new ArrayList<>();

        // get intent data
        Intent intent = getIntent();
        //userCustomerRateList = (List<Rate>)intent.getSerializableExtra("userCustomerRateList");

        initRecyclerView();

        // sort country by hash map key
        Set set = Country_map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for (Object key : arr) {
            Rate r = new Rate((String)key, "", "");
            allCountryList.add(r);
        }

        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.rv_country_list);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        rateRecyclerAdapter = new RateRecyclerAdapter(this, allCountryList);
        recyclerView.setAdapter(rateRecyclerAdapter);
    }
}