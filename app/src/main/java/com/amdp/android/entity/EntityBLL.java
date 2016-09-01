/*******************************************************************************
 * Copyright (c) 2014. Zyght
 * All rights reserved. 
 *
 ******************************************************************************/

package com.amdp.android.entity;

import java.util.ArrayList;

/**
 * Created by Arley Mauricio Duarte
 */
public class EntityBLL {


    protected APIEntity findById(String entityId, ArrayList<APIEntity> vItems) {
        APIEntity apiEntity = null;
        for (APIEntity aux : vItems) {
            if (aux.getEntityId() != null && aux.getEntityId().equals(entityId)) {
                apiEntity = aux;
            }
        }
        return apiEntity;
    }


    public APIEntity findByName(String name, ArrayList<APIEntity> vItems) {
        APIEntity apiEntity = null;
        for (APIEntity aux : vItems) {
            if (aux.getName() != null && aux.getName().equals(name)) {
                apiEntity = aux;
            }
        }
        return apiEntity;
    }

    protected boolean contains(APIEntity apiEntity, ArrayList<APIEntity> vItems) {
        boolean contains = true;
        if (findById(apiEntity.getEntityId(), vItems) == null) {
            contains = false;
        }
        return contains;
    }

    protected boolean containsName(APIEntity apiEntity, ArrayList<APIEntity> vItems) {
        boolean contains = true;
        if (findByName(apiEntity.getName(), vItems) == null) {
            contains = false;
        }
        return contains;
    }
}
