package com.piyush.programs.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SubArraySum {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        int sum=5;
        printPairs(arr,sum);
        twoSum(arr,sum);
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
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.printf("(%d, %d) %n", nums, target);
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}