package com.piyush.programs.integer;

public class FindIntegerValueSameAtIndex {
    public static void main(String[] args){

        System.out.println(findIntegerAtSameIndex(new int[]{-3, -1, 1, 4, 5}));
    }
    static int findIntegerAtSameIndex(int[] nums){
        if(nums==null || nums.length<=0)
            return 0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=left + ((nums.length-1)-left)/2;
            if(nums[middle]==middle)
                return middle;
            if(nums[middle]>middle)
                right=middle-1;
            else
                left=middle+1;

        }
        return -1;
    }

}
