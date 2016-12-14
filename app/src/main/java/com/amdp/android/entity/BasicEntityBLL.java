package com.amdp.android.entity;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by arley on 10/17/16.
 */

public class BasicEntityBLL extends  EntityBLL {

    private static final String TAG = "BasicEntityBLL";
    private static BasicEntityBLL ourInstance = new BasicEntityBLL();

    private BasicEntity current;


    private ArrayList<BasicEntity> items = new ArrayList<BasicEntity>();


    protected BasicEntityBLL(){

    }

    public static BasicEntityBLL getInstance() {
        return ourInstance;
    }


    public void add(BasicEntity item){
        items.add(item);
    }

    public ArrayList<BasicEntity> getItems(){
        return items;
    }

    public  void clear(){
        items.clear();
    }

    public ArrayList<APIEntity> getAPIItems(){

        ArrayList<APIEntity> lItems = new ArrayList<APIEntity>();
        for (BasicEntity l: items) {
            lItems.add(l);
        }

        return lItems;
    }

    public void fillItems(String json, String elementName){


        try {
            JSONObject result = new JSONObject(json);
            JSONArray jsonArray = result.getJSONArray(elementName);
            for (int i = 0; i < jsonArray.length(); i++) {
                fillItem(jsonArray.getString(i));
            }
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
    }


    public void fillItem(String jsonItem) {
        BasicEntity item = new BasicEntity();
        try {
            JSONObject result = new JSONObject(jsonItem);
            item.setEntityId(result.getString("id").trim());
            item.setName(result.getString("name").trim());
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }

        if(TextUtils.isEmpty(item.getName()) == false){
            this.add(item);
        }


    }



}
