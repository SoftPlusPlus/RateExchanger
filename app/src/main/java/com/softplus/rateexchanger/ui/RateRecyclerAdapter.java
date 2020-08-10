package com.softplus.rateexchanger.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Rate;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RateRecyclerAdapter extends RecyclerView.Adapter<RateRecyclerAdapter.RatesHolder> {
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
        holder.tv_currency.setText(rates.getCountry());
        holder.tv_rate.setText(rates.getRate());
    }

    @Override
    public int getItemCount() {
        return rateListFiltered.size();
    }

    public interface CurrencyAdapterListener {
        void onCurrencySelected(Rate rate);
        void onCurrencyLongClickListener(Rate rate);
    }

    public class RatesHolder extends RecyclerView.ViewHolder {
        private ImageView iv_symbol;
        private TextView tv_currency, tv_rate;

        public RatesHolder(@NonNull View itemView) {
            super(itemView);

            iv_symbol = itemView.findViewById(R.id.iv_symbol);
            tv_currency = itemView.findViewById(R.id.tv_currency);
            tv_rate = itemView.findViewById(R.id.tv_rate);
        }
    }
}
