package com.piyush.programs.integer;

import java.util.Arrays;
import java.util.HashSet;

public class LightAllBulbs {

    public static void main(String[] args){
        int[] arr={0,1,0,1};
        System.out.println(getSteps(arr));
    }
    static int getSteps(int[] nums){
        int steps=0,i=0,ans=Integer.MAX_VALUE;
        if(nums.length==1 &&nums[0]==1)
            return 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[i]^1;
                steps++;
                for(int j=i+1;j<nums.length;j++){
                    nums[j]=nums[j]^1;
                }
            }
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j]==1) {
                        continue;
                    } else
                        break;
                }

        steps=Math.min(steps,ans);

        }
        return steps;
    }
}
