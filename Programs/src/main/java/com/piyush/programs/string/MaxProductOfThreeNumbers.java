package com.piyush.programs.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args){
        int[] arr={-65, 41, 15, -11, 69, 23, -63, -4, 49, -99, -61, 17, -61};
        System.out.println(getMaxProduct(arr));
    }
    static int getMaxProduct(int[] arr){
        int max=Integer.MIN_VALUE;
        int i=0,j=1,max_so_far=2;
        Arrays.sort(arr);
        while(i<arr.length-3 && j< arr.length-2){
            int product=1;
            product=arr[i]*arr[j]*arr[max_so_far];
            if(product>max)
                max=product;
            if(max_so_far!=arr.length-1)
                max_so_far++;
            else{
                i++;
                j++;
                max_so_far=j+1;
            }
        }
        return max;
    }

    public int maxp3(ArrayList<Integer> arr) {
        int max=Integer.MIN_VALUE;
        int i=0,j=1,max_so_far=2;
        Collections.sort(arr);
        return Math.max(arr.get(0) * arr.get(1) * arr.get(arr.size()-1),
                arr.get(arr.size()-1) * arr.get(arr.size()-2) * arr.get(arr.size()-3));
    }
}
