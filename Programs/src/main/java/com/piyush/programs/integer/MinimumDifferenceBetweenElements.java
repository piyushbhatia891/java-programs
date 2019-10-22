package com.piyush.programs.integer;


import java.util.Arrays;

public class MinimumDifferenceBetweenElements {
    public static void main(String[] args){
        System.out.println(findMinimumDifference(new int[]{1,3,2,6},4));
    }
    static int findMinimumDifference(int[] ar,int length){
        Arrays.sort(ar);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i+1]-ar[i]<diff)
                diff=ar[i+1] - ar[i];

        }
        return diff;
    }

}
