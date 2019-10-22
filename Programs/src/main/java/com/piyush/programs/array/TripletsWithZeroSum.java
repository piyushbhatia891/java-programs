package com.piyush.programs.array;

import java.util.Arrays;

public class TripletsWithZeroSum {
    public static void main(String[] args){
        int[] arr={1,0,-2,4,1};
        findTriplets(arr);
    }
    static void findTriplets(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            int l=i+1;
            int r=arr.length-1;
            int x=arr[i];
            while (l<r){
                if(x+arr[l]+arr[r]==0){
                    System.out.println(arr[l]+" "+arr[r]);
                    l++;
                    r--;
                }
                else if(x+arr[l]+arr[r] <0)
                    l++;
                else
                    r--;
            }

        }

    }
}
