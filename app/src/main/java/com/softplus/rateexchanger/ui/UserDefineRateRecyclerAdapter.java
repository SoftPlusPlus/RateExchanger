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
import com.softplus.rateexchanger.models.Country;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.DEFAULT_VIEW_ITEMS;
import static com.softplus.rateexchanger.utilities.Constants.ITEM_FOCUS_BACKGROUND_COLOR;
import static com.softplus.rateexchanger.utilities.Constants.ITEM_UNFOCUS_BACKGROUND_COLOR;

public class UserDefineRateRecyclerAdapter extends RecyclerView.Adapter<UserDefineRateRecyclerAdapter.CountryHolder> {
    private final String LOG_TAG = this.getClass().getSimpleName();

    private int selectedRow = 0;
    private Context context;
    private List<Country> countryList;

    public UserDefineRateRecyclerAdapter(Context context) {
        this.context = context;
        this.countryList = new ArrayList<>();
        readUserDefineCountryList();
    }

    private void readUserDefineCountryList() {
        // Read preferences settings
        SharedPreferences preferences = context.getSharedPreferences("UserPreferences", Context.MODE_PRIVATE);
        String customerItems = preferences.getString("customerItems", "");

        if (customerItems.isEmpty()) { // no settings, save default to file
            preferences.edit().putString("customerItems", DEFAULT_VIEW_ITEMS).commit();
            customerItems = DEFAULT_VIEW_ITEMS;
        }

        // save settings to list
        String list[] = customerItems.split(",");
        for (int i = 0; i < list.length; i++) {
            Country r = new Country(list[i], "", "");
            this.countryList.add(r);
        }

        // update UI
        notifyDataSetChanged();
    }

    public void addCountry(String country) {
        // find if country exist?
        boolean find = false;
        for (int i = 0; i < countryList.size(); i++) {
            if (countryList.get(i).getSymbol().equals(country)) {
                find = true;
                break;
            }
        }

        // add country to lsit
        if (!find) {
            countryList.add(new Country(country, "", ""));
            notifyDataSetChanged();
            // TODO: save to SharedPreference
        }
    }

    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rate_item, parent, false);
        CountryHolder vh = new CountryHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final CountryHolder holder, final int position) {
        Country rates = countryList.get(position);

        holder.iv_symbol.setImageResource(rates.getImageId());
        holder.tv_symbol.setText(rates.getSymbol());
        holder.tv_currency.setText(rates.getCountry());
        holder.et_value.setText(rates.getRate());

        holder.ll_view_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifyItemChanged(selectedRow); // notify "OLD" selected for clear background color
                selectedRow = holder.getLayoutPosition();
                notifyItemChanged(selectedRow); // notify "NEW" selected for set background color
                holder.et_value.requestFocus();
                holder.et_value.setSelection(holder.et_value.getText().length());
            }
        });

        holder.ll_view_group.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                countryList.remove(holder.getLayoutPosition());
                notifyDataSetChanged();
                return false;
            }
        });

        holder.et_value.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                int _position = holder.getLayoutPosition();
                if (holder.et_value.hasFocus()) {
                    countryList.get(_position).setRate(editable.toString());
                    updateValues(_position);
                    holder.et_value.setSelection(holder.et_value.getText().length());
                }
            }
        });

        if (selectedRow == position)
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_FOCUS_BACKGROUND_COLOR));
        else
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_UNFOCUS_BACKGROUND_COLOR));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    private void updateValues(int currentPosition) {
        String inputString = countryList.get(currentPosition).getRate();
        if (inputString.isEmpty())
            return;

        // TODO: processing big integer
        int t = Integer.parseInt(inputString);

        for (int i = 0; i < countryList.size(); i++) {
            if (i == currentPosition)
                continue;;

            int value = t * (i + 1);
            countryList.get(i).setRate(Integer.toString(value));
            notifyItemChanged(i);
            Log.i(LOG_TAG, Integer.toString(value));
        }
    }

    public class CountryHolder extends RecyclerView.ViewHolder {
        private LinearLayout ll_view_group;
        private ImageView iv_symbol;
        private EditText et_value;
        private TextView tv_currency, tv_symbol;

        public CountryHolder(@NonNull final View itemView) {
            super(itemView);

            ll_view_group = itemView.findViewById(R.id.rate_item_group);
            iv_symbol = itemView.findViewById(R.id.iv_symbol);
            tv_symbol = itemView.findViewById(R.id.tv_symbol);
            tv_currency = itemView.findViewById(R.id.tv_currency);
            et_value = itemView.findViewById(R.id.et_rate);
        }
    }
}
