package com.piyush.programs.array;

import java.util.HashSet;
import java.util.Set;


public class SubArraySum {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        int sum=5;
        printPairs(arr,sum);
    }
    static void printPairs(int[] arr,int sum){
        Set set=new HashSet(arr.length);
        for(int nums:arr){
            int target = sum - nums;
            // if target number is not in set then add
            if(!set.contains(target))
            {
                set.add(nums);
            }
            else
                { System.out.printf("(%d, %d) %n", nums, target); } }

    }
}