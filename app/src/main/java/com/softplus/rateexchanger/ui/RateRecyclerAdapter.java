package com.softplus.rateexchanger.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.softplus.rateexchanger.CountryListActivity;
import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Rate;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RateRecyclerAdapter extends RecyclerView.Adapter<RateRecyclerAdapter.RatesHolder> implements Filterable {
    private Context context;
    private List<Rate> rateList;
    private List<Rate> rateListFiltered;

    public RateRecyclerAdapter(Context context, List<Rate> rateList) {
        this.context = context;
        this.rateList = rateList;
        this.rateListFiltered = rateList;
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
        Rate rates = rateListFiltered.get(position);

        holder.iv_symbol.setImageResource(rates.getImageId());
        holder.tv_symbol.setText(rates.getSymbol());
        holder.tv_currency.setText(rates.getCountry());
        holder.tv_rate.setText(rates.getRate());
    }

    @Override
    public int getItemCount() {
        return rateListFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    rateListFiltered = rateList;
                }
                else {
                    List<Rate> filteredList = new ArrayList<>();
                    for (Rate r: rateList) {
                        if (r.getCountry().toLowerCase().contains(charString.toLowerCase()) ||
                                r.getSymbol().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(r);
                        }
                    }
                    rateListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = rateListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                rateListFiltered = (ArrayList<Rate>)filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public interface CurrencyAdapterListener {
        void onCurrencySelected(Rate rate);
        void onCurrencyLongClickListener(Rate rate);
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, tv_currency.getText(), Toast.LENGTH_LONG).show();

                    ((CountryListActivity)context).setResult(Activity.RESULT_OK, new Intent().putExtra("AddCountry", tv_symbol.getText()));

                    ((CountryListActivity)context).finish(); // close country list activity
                }
            });
        }
    }
}
