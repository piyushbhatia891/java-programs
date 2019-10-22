package com.piyush.programs.integer;

public class SearchInsertionPosition {
    public static void main(String[] args){
        int[] nums={1,2,5,6};
        System.out.println(getIndexOfTarget(nums,5));
    }
    static int getIndexOfTarget(int[] nums,int target){
        int l=0;
        int r=nums.length-1;


        while (l<r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
