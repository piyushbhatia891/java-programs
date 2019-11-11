package com.piyush.programs.array;

public class KeepTwoDuplicates {
    public static void main(String[] args){
        int[] arr={1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010};
        System.out.println(getLengthOfArray(arr));
    }
    static int getLengthOfArray(int[] nums){
        if(nums==null){
            return 0;
        }

        if (nums.length <= 2){
            return nums.length;
        }
        int i = 1; // point to previous
        int j = 2; // point to current
        while (j < nums.length) {
            if (nums[j] == nums[i] && nums[j] == nums[i - 1]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i + 1;
    }
}
