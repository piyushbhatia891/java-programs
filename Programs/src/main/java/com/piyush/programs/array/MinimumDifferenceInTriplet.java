package com.piyush.programs.array;

public class MinimumDifferenceInTriplet {
    public static void main(String[] args){
        int[] arr1={1,4,5,8,10};
        int[] arr2={6,9,10};
        int[] arr3={2,3,6,10};
        System.out.println(getMinimumDifference(arr1,arr2,arr3));
    }

    static int getMinimumDifference(int[] arr1,int[] arr2,int[] arr3){
        int a=0,b=0,c=0;
        int min=Integer.MAX_VALUE;
        int result=0;
        while(a<arr1.length && b<arr2.length && c<arr3.length){
            int minimumNumber=Math.min(arr1[a],Math.min(arr2[b],arr3[c]));
            int maximumNumber=Math.max(arr1[a],Math.max(arr2[b],arr3[c]));
            result=Math.abs(maximumNumber-minimumNumber);
            if(result<min)
                min=result;
            if(arr1[a]==minimumNumber)
                a++;
            else if(arr2[b]==minimumNumber)
                b++;
            else if(arr3[c]==minimumNumber)
                c++;

        }
        return min;
    }
}
