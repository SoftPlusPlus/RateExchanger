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

import com.softplus.rateexchanger.AllCountryList;
import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Rate;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllCountryRecyclerAdapter extends RecyclerView.Adapter<AllCountryRecyclerAdapter.RatesHolder> implements Filterable {

    Context context;
    List<Rate> allCountryList;
    List<Rate> filteredList;

    public AllCountryRecyclerAdapter(Context _context, List<Rate> _list) {
        context = _context;
        allCountryList = new ArrayList<>(_list);
        filteredList = new ArrayList<>(_list);
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
        Rate rates = filteredList.get(position);

        holder.iv_country.setImageResource(rates.getImageId());
        holder.tv_symbol.setText(rates.getSymbol());
        holder.tv_currency.setText(rates.getCurrency());

        //double rate = Double.parseDouble(rates.getRate());
        //String roundedRate = String.format(Locale.ENGLISH, "%.2f", rate);
        //holder.tv_rate.setText(roundedRate);
        holder.tv_rate.setText("");

    }

    @Override
    public int getItemCount() {
        return filteredList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    filteredList = allCountryList;
                }
                else {
                    List<Rate> tmpList = new ArrayList<>();
                    for (Rate r: allCountryList) {
                        if (r.getCountry().toLowerCase().contains(charString.toLowerCase()) ||
                                r.getSymbol().toLowerCase().contains(charString.toLowerCase())) {
                            tmpList.add(r);
                        }
                    }
                    filteredList = tmpList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredList = (ArrayList<Rate>)filterResults.values;
                notifyDataSetChanged();
            }
        };
    }


    public class RatesHolder extends RecyclerView.ViewHolder {
        private ImageView iv_symbol, iv_country;
        private TextView tv_currency, tv_rate, tv_symbol;

        public RatesHolder(@NonNull View itemView) {
            super(itemView);

            iv_country = itemView.findViewById(R.id.iv_symbol);
            tv_symbol = itemView.findViewById(R.id.tv_symbol);
            tv_currency = itemView.findViewById(R.id.tv_currency);
            tv_rate = itemView.findViewById(R.id.tv_rate);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((AllCountryList)context).setResult(Activity.RESULT_OK, new Intent().putExtra("AddCountry", tv_symbol.getText()));
                    ((AllCountryList)context).finish(); // close country list activity
                }
            });

        }
    }
}
