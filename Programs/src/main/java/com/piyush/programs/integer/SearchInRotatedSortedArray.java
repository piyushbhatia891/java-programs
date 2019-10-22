package com.piyush.programs.integer;


public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] arr={4,5,6,7,1,2,4};
        System.out.println(getPositionOfTarget(arr,5));
    }
    static int getPositionOfTarget(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(nums[mid]==target)
                return mid;
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target&& target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }

            else{
                if(nums[mid]<target&& target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
