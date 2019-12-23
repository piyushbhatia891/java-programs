package com.piyush.programs.stacks_queues;

import java.util.Arrays;

public class MaximumSlidingWindowArray {
    public static void main(String[] args){
        int[] arr={648, 614, 490, 138, 657, 544, 745, 582, 738,
                    229,775, 665, 876, 448, 4, 81, 807, 578,
                712, 951,867, 328, 308, 440, 542, 178, 637,
                446, 882,760, 354, 523, 935, 277, 158, 698,
                536, 165,892, 327, 574, 516, 36, 705, 900,
                482, 558,937, 207, 368};
        getMaximumWindowArray(arr,9);
    }
    static void getMaximumWindowArray(int[] arr,int k){
        int[] arrReturned=new int[arr.length-k+1];
        int max=0,index=0;
        for (int i = 0; i <= arr.length - k; i++) {

            max = arr[i];

            for (int j = i+1; j < k+i; j++) {
                if (arr[j] > max)
                    max = arr[j];
            }
            arrReturned[index]=max;
            index++;
            System.out.print(max + " ");
        }
        System.out.print(arrReturned);
    }
}
