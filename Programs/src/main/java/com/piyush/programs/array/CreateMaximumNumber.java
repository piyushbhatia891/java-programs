package com.piyush.programs.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateMaximumNumber {
    public static void main(String[] args){
        int[] m={3,4,6,5};//6 5 4 3
        int[] n={9,1,2,5,8,3};// 9 8 5 3 2 1
        getMaximumNumber(m,n,5);
    }

    static void getMaximumNumber(int[] m,int[] n,int k){
        int[] output=new int[k];
        Arrays.sort(m);
        Arrays.sort(n);
        int len=Math.max(m.length,n.length);
        int l=0,r=0,i=0;
        while(l<m.length && r<n.length){
            if(m[l]>=n[r])
                output[i++] = m[l++];
            else
                output[i++] = n[r++];
        }
        System.out.println(output.length);
    }
}
