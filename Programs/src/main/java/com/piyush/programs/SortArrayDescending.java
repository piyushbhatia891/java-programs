package com.piyush.programs;

public class SortArrayDescending {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
        reverse2(arr,arr.length);
    }
    static void reverse(int[] arr){
        int [] b =new int[arr.length];
        int j=arr.length;
        for(int var:arr){
            b[j-1]=var;
            j=j-1;
        }
        for(int var2:b){
            System.out.println(var2);
        }
    }

    static void reverse2(int[] arr,int length){
        int i,k,t;
        for(i=0;i<length/2;i++){
            t=arr[i];
            arr[i]=arr[length-i-1];
            arr[length-i-1]=t;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
