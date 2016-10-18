package com.amdp.android.entity;

import java.util.ArrayList;

/**
 * Created by arley on 10/17/16.
 */

public class BasicEntityBLL extends  EntityBLL {

    private static BasicEntityBLL ourInstance = new BasicEntityBLL();

    private BasicEntity current;


    private ArrayList<BasicEntity> items = new ArrayList<BasicEntity>();


    private BasicEntityBLL(){

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

}
