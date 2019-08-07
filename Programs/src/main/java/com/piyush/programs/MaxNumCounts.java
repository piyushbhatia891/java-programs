package com.piyush.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by piyushbha on 7/29/2019.
 */
public class MaxNumCounts {
    public static void main(String[] args){
        int [] arr={3,2,1,3};
        Integer ar[]=new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = Integer.valueOf(arr[i]);
        }
        Map<Integer,Integer> counts=new HashMap<Integer,Integer>();
        for(Integer val:ar){
            if(counts.containsKey(val))
                counts.put(val,counts.get(val)+1);
            else
                counts.put(val,1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {  // Itrate through hashmap
            //if (entry.getValue()==maxValueInMap) {
               // maxCounts++;
            }
        }
        //return counts.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

       // System.out.println(maxCounts);
    }

