package com.piyush.programs.integer;


public class JumpGame2 {
    public static void main(String[] args){
        int[] arr={2,3,1,1,4};
        System.out.println(getTotalSteps(arr));
        System.out.println(getTotalStepsInMemoryEfficientManner(arr));
    }

    static int getTotalStepsInMemoryEfficientManner(int[] nums){
        if (nums == null || nums.length == 0)
            return 0;

        int lastReach = 0;
        int reach = 0;
        int step = 0;

        for (int i = 0; i <= reach && i < nums.length; i++) {
            //when last jump can not read current i, increase the step by 1
            if (i > lastReach) {
                step++;
                lastReach = reach;
            }
            //update the maximal jump
            reach = Math.max(reach, nums[i] + i);
        }

        if (reach < nums.length - 1)
            return 0;

        return step;
    }

    static int getTotalSteps(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // State
        int[] dp = new int[nums.length];

        // Initialize
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Function
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] + j >= i && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }

        // Answer
        return dp[nums.length - 1];

    }
}

