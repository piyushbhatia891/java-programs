package com.piyush.programs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.piyush.models.DetailPojo;

/**
 * Created by piyushbha on 9/26/2018.
 */
public class JsonMapperNested {
    public static void main(String[] args){
        try{
            JsonNode node=new ObjectMapper().readTree("nestedMapper.json");
            DetailPojo pojo=new DetailPojo();
            pojo.setId(node.get("id").textValue());
            pojo.setName(node.get("name").textValue());
            pojo.setBrandName(node.get("brand").get("name").textValue());
            pojo.setOwnerName(node.get("owner").get("name").textValue());
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
