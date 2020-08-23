package com.softplus.rateexchanger.ui;

import android.content.Context;
import android.content.SharedPreferences;
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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.softplus.rateexchanger.utilities.Constants.CountryList;
import static com.softplus.rateexchanger.utilities.Constants.DEFAULT_VIEW_ITEMS;

public class UserDefineRateRecyclerAdapter extends RecyclerView.Adapter<UserDefineRateRecyclerAdapter.CountryHolder> {
    private final String LOG_TAG = this.getClass().getSimpleName();

    private int selectedRow = 0;
    private Context context;
    private HashMap<String, String> rateList;
    private List<Country> userDefineCountryList;
    private HashMap<String, String> translate;

    public UserDefineRateRecyclerAdapter(Context context, List<Country> rateList) {
        this.context = context;
        //this.rateList = new ArrayList<>(rateList);
        this.userDefineCountryList = new ArrayList<>();
        this.translate = new HashMap<>();
        readUserDefineCountryList();

        Log.i(LOG_TAG, "on user define adapter create ==> " + CountryList.get("TWD").getRate());
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
            //Country r = new Country(list[i], "", "");
            Country r = CountryList.get(list[i]);
            this.userDefineCountryList.add(r);
            translate.put(list[i], "");
        }

        // update UI
        notifyDataSetChanged();
    }

    public void addCountry(String country) {
        // find if country exist?
        boolean find = false;
        for (int i = 0; i < userDefineCountryList.size(); i++) {
            if (userDefineCountryList.get(i).getSymbol().equals(country)) {
                find = true;
                break;
            }
        }

        // add country to lsit
        if (!find) {
            Country r = CountryList.get(country);
            userDefineCountryList.add(r);
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
        Country rates = userDefineCountryList.get(position);

        holder.iv_symbol.setImageResource(rates.getImageId());
        holder.tv_symbol.setText(rates.getSymbol());
        holder.tv_currency.setText(rates.getCountry());
        holder.et_value.setText(translate.get(rates.getSymbol()));

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
                userDefineCountryList.remove(holder.getLayoutPosition());
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
                    //userDefineCountryList.get(_position).setRate(editable.toString());
                    updateValues(_position, editable.toString());
                    holder.et_value.setSelection(holder.et_value.getText().length());
                }
            }
        });

        /*
        if (selectedRow == position)
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_FOCUS_BACKGROUND_COLOR));
        else
            holder.ll_view_group.setBackgroundColor(Color.parseColor(ITEM_UNFOCUS_BACKGROUND_COLOR));

         */
    }

    @Override
    public int getItemCount() {
        return userDefineCountryList.size();
    }

    private void updateValues(int currentPosition, String inputString) {

        if (inputString.isEmpty())
            return;

        // TODO: processing big integer
        BigInteger 
        float inputValue = Float.parseFloat(inputString);
        String inputCountry = userDefineCountryList.get(currentPosition).getSymbol();
        float inputCountryRate = Float.parseFloat( CountryList.get(inputCountry).getRate());
        float USD_BASE = inputValue / inputCountryRate;

        for (int i = 0; i < userDefineCountryList.size(); i++) {
            if (i == currentPosition)
                continue;;

            float currentCountryRate = Float.parseFloat(userDefineCountryList.get(i).getRate());
            float value = USD_BASE * currentCountryRate;

            String symbol = userDefineCountryList.get(i).getSymbol();
            translate.put(symbol, Float.toString(value));
            notifyItemChanged(i);
            Log.i(LOG_TAG, "current: " + symbol + " USD_BASE: " + Float.toString(value) + " output: " + Float.toString(value));
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
