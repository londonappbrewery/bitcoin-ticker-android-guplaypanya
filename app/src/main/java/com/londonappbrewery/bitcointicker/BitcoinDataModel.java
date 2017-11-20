package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    // TODO: Declare the member variables here
    private String mPrice;

    // TODO: Create a WeatherDataModel from a JSON:
    public static BitcoinDataModel fromjson(JSONObject jsonObject){

        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.mPrice = jsonObject.getString("last");

            return bitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice() {
        return mPrice;
    }
}
