package com.piyush.programs.array;

public class SmallLargeUnsortedArray {
    public static void main(String[] args){
        largestNumber(new int[]{1,4,2,3,2,8,5});
    }
    static void largestNumber(int[] arr){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int val:arr){
            if(val>large){
                large=val;
            }
            if(val<small){
                small=val;
            }
        }
        System.out.println(large + " "+small);
    }
}
