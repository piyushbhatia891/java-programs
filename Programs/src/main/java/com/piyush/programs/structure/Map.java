package com.piyush.programs.structure;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Map {
    public static void main(String[] args){
        java.util.Map<String,Integer> values=new IdentityHashMap<String, Integer>();
        values.put("piyush",1);
        values.put(new String("piyush"),1);
        System.out.println(values.keySet().size());
    }
}
