package com.amdp.android.entity;

/**
 * Created by arley on 10/17/16.
 */

public class BasicEntity implements  APIEntity {

    private String entityId="";
    private String name="";

    @Override
    public String getEntityId() {
        return entityId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
