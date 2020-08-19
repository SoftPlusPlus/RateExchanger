package com.softplus.rateexchanger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.softplus.rateexchanger.models.Rate;
import com.softplus.rateexchanger.ui.AllCountryRecyclerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.Country_map;

public class AllCountryList extends AppCompatActivity {

    private final String LOG_TAG = this.getClass().getSimpleName();

    AllCountryRecyclerAdapter allCountryRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_country_list);

        initToolbar();
        initRecyclerView();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_all_country);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_all_country_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.toolbar_search);
        SearchView searchView = (SearchView)searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                allCountryRecyclerAdapter.getFilter().filter(s);
                return false;
            }
        });

        return true;
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_all_country_list);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // sort country by hash map key
        List<Rate> allCountry = new ArrayList<>();
        Set set = Country_map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for (Object key : arr) {
            Rate r = new Rate((String)key, "", "");
            allCountry.add(r);
        }

        allCountryRecyclerAdapter = new AllCountryRecyclerAdapter(this, allCountry);
        recyclerView.setAdapter(allCountryRecyclerAdapter);
    }
}