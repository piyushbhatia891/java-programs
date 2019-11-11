package com.piyush.programs.array;

public class MergeTwoArrays {
    public static void main(String[] args){
        int[] arr1={-4,3};
        int[] arr2={-2,-2};
        int[] newArray=getMergedArray(arr1,arr2);
        for(int n:newArray)
            System.out.println(n);
    }
    static int[] getMergedArray(int[] arr1,int[] arr2){
        int l=0,r=0,index=0;
        int[] newArray=new int[arr1.length+arr2.length];
        while(l<arr1.length && r<arr2.length){
            if(arr1[l]<arr2[r])
                newArray[index++]=arr1[l++];
            else
                newArray[index++]=arr2[r++];

        }
        while (l < arr1.length)
            newArray[index++] = arr1[l++];

        // Store remaining elements of second array
        while (r < arr2.length)
            newArray[index++] = arr2[r++];
        return newArray;
    }
}
