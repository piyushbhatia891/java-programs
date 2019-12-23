package com.piyush.programs.array;


public class BetweenTwoSets {
    public static void main(String[] args){
        int[] arr1={2,6};
        int[] arr2={24,36};
        int val1=arr1[arr1.length-1];
        int val2=arr2[0];
        int count=0,j=0,k=0;
        for(int i=val1;i<=val2;i++){
            j=0;k=0;
            for(j=0;j<arr1.length;j++){
                if(i%arr1[j]!=0)
                    break;
            }
            for(k=0;k<arr2.length;k++){
                if(arr2[k]%i!=0)
                    break;
            }
            if(j==arr1.length-1 && k==arr2.length-1)
                count++;
        }
        System.out.println(count);
    }
}
