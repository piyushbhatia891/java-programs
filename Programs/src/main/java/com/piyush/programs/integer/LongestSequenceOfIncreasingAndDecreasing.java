package com.piyush.programs.integer;


import java.util.Arrays;

public class LongestSequenceOfIncreasingAndDecreasing {
    public static void main(String[] args){
        int[] arr={1,11,2,10,4,5,2,1};
        System.out.println(getLength(arr));
        getMaxLength(arr);
    }

    static void getMaxLength(int[] arr){
        int[] lis=new int[arr.length];
        int[] lds=new int[arr.length];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);
        int maxBiotonicLength=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[j]+1>lis[i])
                    lis[i]=lis[j]+1;
            }
        }
        maxBiotonicLength = lis[0]+lds[0]-1;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i] && lds[j]+1>lds[i])
                    lds[i]=lds[j]+1;
            }
            maxBiotonicLength=Math.max(maxBiotonicLength,lis[i]+lds[i]-1);
        }
        System.out.println(maxBiotonicLength);
    }

    static int getLength(int[] A){
        // I[i] stores the length of the longest increasing subsequence
        // ending with A[i]
        int[] I = new int[A.length];

        // D[i] stores the length of the longest decreasing subsequence
        // starting with A[i]
        int[] D = new int[A.length];

        int n = A.length - 1;

        I[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && I[j] > I[i])
                    I[i] = I[j];
            }
            I[i]++;
        }

        D[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                if (A[j] < A[i] && D[j] > D[i])
                    D[i] = D[j];
            }
            D[i]++;
        }

        // consider each element as peak and calculate LBS
        int lbs = 1;
        for (int i = 0; i <= n; i++) {
            lbs = Integer.max(lbs, I[i] + D[i] - 1);
        }

        return lbs;
    }
}
