package com.piyush.programs.array;


public class ClosestPairInSortedArray {
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={1,3,5,7};
        int closest=10;
        closest(arr1,arr2,arr1.length,arr2.length,closest);
    }
    static void closest(int[] arr1,int[] arr2,int len1,int len2,int closest){
        int diff=Integer.MAX_VALUE;
        int l=0;
        int r=len2-1;
        int res_l=0,res_r=0;
        while(l<len1 && r>=0){
            if(Math.abs(arr1[l]+arr2[r]-closest)<diff){
                res_l=l;
                res_r=r;
                diff=Math.abs(arr1[l]+arr2[r]-closest);
            }
            if(arr1[l]+arr2[r]<closest)
                l++;
            else
                r--;
        }
        System.out.println(res_l+ " "+res_r);
    }
}
