package com.softplus.rateexchanger.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Rate;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.DEFAULT_VIEW_ITEMS;
import static com.softplus.rateexchanger.utilities.Constants.ITEM_FOCUS_BACKGROUND_COLOR;
import static com.softplus.rateexchanger.utilities.Constants.ITEM_UNFOCUS_BACKGROUND_COLOR;

public class RateRecyclerAdapter extends RecyclerView.Adapter<RateRecyclerAdapter.RatesHolder> {
    private final String LOG_TAG = this.getClass().getSimpleName();

    private int selectedRow = 0;
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
            // TODO: save to SharedPreference
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
        holder.et_value.setText(rates.getRate());

        if (selectedRow == position) {
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_FOCUS_BACKGROUND_COLOR));
        }
        else {
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_UNFOCUS_BACKGROUND_COLOR));
        }
    }

    @Override
    public int getItemCount() {
        return rateList.size();
    }

    private void updateValues(int currentPosition) {
        String inputString = rateList.get(currentPosition).getRate();
        if (inputString.isEmpty())
            return;

        // TODO: processing big integer
        int t = Integer.parseInt(inputString);

        for (int i = 0; i < rateList.size(); i++) {
            if (i == currentPosition)
                continue;;

            int value = t * i;
            rateList.get(i).setRate(Integer.toString(value));
            Log.i(LOG_TAG, Integer.toString(value));
        }
    }

    public class RatesHolder extends RecyclerView.ViewHolder {
        private LinearLayout ll_view_group;
        private ImageView iv_symbol;
        private EditText et_value;
        private TextView tv_currency, tv_symbol;

        public RatesHolder(@NonNull final View itemView) {
            super(itemView);

            ll_view_group = itemView.findViewById(R.id.rate_item_group);
            iv_symbol = itemView.findViewById(R.id.iv_symbol);
            tv_symbol = itemView.findViewById(R.id.tv_symbol);
            tv_currency = itemView.findViewById(R.id.tv_currency);
            et_value = itemView.findViewById(R.id.et_rate);

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    et_value.requestFocus();
                    selectedRow = getLayoutPosition();
                    notifyDataSetChanged();
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    rateList.remove(getLayoutPosition());
                    notifyDataSetChanged();
                    return false;
                }
            });

            et_value.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    if (et_value.hasFocus()) {
                        String inputString = editable.toString();
                        int currentPosition = getLayoutPosition();
                        rateList.get(currentPosition).setRate(inputString);
                        updateValues(currentPosition);
                        notifyDataSetChanged();

                        et_value.setSelection(et_value.getText().length());
                        Log.i(LOG_TAG, "Length: " + Integer.toString( et_value.getText().length()));
                        Log.i(LOG_TAG, "cursor start: " + Integer.toString( et_value.getSelectionStart()));
                        Log.i(LOG_TAG, "cursor end: " + Integer.toString( et_value.getSelectionEnd()));
                    }
                }
            });
        }
    }
}
