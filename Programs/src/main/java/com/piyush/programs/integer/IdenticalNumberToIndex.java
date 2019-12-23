package com.piyush.programs.integer;

public class IdenticalNumberToIndex {
    public static void main(String[] args){
        int[] arr={-1,0,1,2,4};
        System.out.println(getPositionOfNumber(arr));
    }

    static int getPositionOfNumber(int[] arr){
        int len=arr.length;
        int l=0,r=len-1,middle=0;
        while(l<=r){
            middle=l+((r-l)/2);
            if(arr[middle]==middle)
                return middle;
            if(arr[middle]>middle)
                r=middle-1;
            else
                l=middle+1;
        }
        return -1;
    }
}
