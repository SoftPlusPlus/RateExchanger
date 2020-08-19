package com.softplus.rateexchanger.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Rate;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.DEFAULT_VIEW_ITEMS;

public class RateRecyclerAdapter extends RecyclerView.Adapter<RateRecyclerAdapter.RatesHolder> {
    private final String LOG_TAG = this.getClass().getSimpleName();

    private Context context;
    private List<Rate> rateList;

    public RateRecyclerAdapter(Context context) {
        this.context = context;
        this.rateList = new ArrayList<>();
        readUserRateList();
    }

    private void readUserRateList() {
        // Get user preferences
        String customerItems = readCustomerItems();

        // save settings to list
        String list[] = customerItems.split(",");
        for (int i = 0; i < list.length; i++) {
            Rate r = new Rate(list[i], "", "");
            this.rateList.add(r);
        }

        // update UI
        notifyDataSetChanged();
    }

    private String readCustomerItems() {
        // Read preferences settings
        SharedPreferences preferences = context.getSharedPreferences("UserPreferences", Context.MODE_PRIVATE);
        String customerItems = preferences.getString("customerItems", "");

        if (customerItems.isEmpty()) { // no settings, save default to file
            preferences.edit().putString("customerItems", DEFAULT_VIEW_ITEMS).commit();
            customerItems = DEFAULT_VIEW_ITEMS;
        }

        return customerItems;
    }

    public void addCountry(String country) {
        // find if country exist?
        boolean find = false;
        for (int i = 0; i < rateList.size(); i++) {
            if (rateList.get(i).getSymbol().equals(country)) {
                find = true;
                break;
            }
        }

        // add country to lsit
        if (!find) {
            rateList.add(new Rate(country, "", ""));
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public RatesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rate_item, parent, false);
        RatesHolder vh = new RatesHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RatesHolder holder, int position) {
        Rate rates = rateList.get(position);

        holder.iv_symbol.setImageResource(rates.getImageId());
        holder.tv_symbol.setText(rates.getSymbol());
        holder.tv_currency.setText(rates.getCountry());
        holder.tv_rate.setText(rates.getRate());
    }

    @Override
    public int getItemCount() {
        return rateList.size();
    }

    public class RatesHolder extends RecyclerView.ViewHolder {
        private ImageView iv_symbol;
        private TextView tv_currency, tv_rate, tv_symbol;

        public RatesHolder(@NonNull View itemView) {
            super(itemView);

            iv_symbol = itemView.findViewById(R.id.iv_symbol);
            tv_symbol = itemView.findViewById(R.id.tv_symbol);
            tv_currency = itemView.findViewById(R.id.tv_currency);
            tv_rate = itemView.findViewById(R.id.tv_rate);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    rateList.remove(getLayoutPosition());
                    notifyDataSetChanged();
                    return false;
                }
            });
        }
    }
}
