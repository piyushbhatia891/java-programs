package com.piyush.programs.integer;

import static java.lang.StrictMath.abs;

/**
 * Created by piyushbha on 9/25/2019.
 */
public class SearchInAdjacentNumbers {
    public static void main(String[] args){

        findIndex(new int[]{1,2,3,4,5,6,7,6},8,6);
    }
    static void findIndex(int[] nums,int length,int target ){
        if(nums==null || nums.length<=0)
            System.out.println("array is null");
        int index=0;
        while(index<length && nums[index]!=target){
            int delta=target-nums[index];
            index+=abs(delta);
        }
        if(index<length)
            System.out.println(index);
    }
}
