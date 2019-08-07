package com.piyush.models;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by piyushbha on 9/26/2018.
 */
public class DetailPojo {
    private String id;
    private String name;
    private String brandName;
    private String ownerName;
    public DetailPojo(){

    }
    public DetailPojo(String json){
        ObjectMapper mapper=new ObjectMapper();
        try{
            DetailPojo pojoObj=mapper.readValue(json,DetailPojo.class);
            this.id=pojoObj.getId();
            this.name=pojoObj.getName();
            this.ownerName=pojoObj.getOwnerName();
            this.brandName=pojoObj.getBrandName();
        }
        catch (Exception e){

        }

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
