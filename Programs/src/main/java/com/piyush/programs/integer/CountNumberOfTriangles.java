package com.piyush.programs.integer;


import java.util.Arrays;

public class CountNumberOfTriangles {
    public static void main(String[] args){
        int[] arr={10, 21, 22, 100, 101, 200, 300};//10 21 22 100 101 200 300
        countAndPrintNumberOfTriangles(arr,arr.length);
    }
    static void countAndPrintNumberOfTriangles(int[] arr,int length){
        Arrays.sort(arr);
        int k=0,count=0;
        for(int i=0;i<length-2;i++){
            k=i+2;
            for(int j=i+1;j<length;j++){
                while(k<length && arr[i]+arr[j]>arr[k])
                    ++k;
                if(k>j)
                    count+=k-j-1;
            }
        }
        System.out.println(count);
    }
}
