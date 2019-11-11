package com.piyush.programs.array;

public class SortColors {
    public static void main(String[] args){
        int[] arr={ 1, 0, 0, 1, 1, 0, 0, 2, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0, 0, 2, 0, 2, 2, 2, 0, 0, 1, 1, 1, 2, 2, 0, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 0, 0, 1, 2, 1, 1, 0, 1, 0, 2, 0, 2, 1, 0, 1, 1, 0, 0, 1, 2, 0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 1, 2, 2, 2, 0, 1, 1, 0, 2, 2, 2, 0, 0, 0, 0, 1, 1, 2, 1, 0, 1, 0, 1, 2, 2, 1, 0, 2, 0, 0, 1, 2, 1, 0, 2, 1, 0, 2, 0, 2, 1, 1, 1, 1, 1, 0, 1, 2, 0, 0, 1, 0, 1, 2, 0, 1, 1, 2, 1, 0, 2, 0, 0, 0, 2, 0, 1, 0, 2, 1, 1, 0, 1, 2, 1, 0, 0};
        System.out.println(getArray(arr));
    }
    static int[] getArray(int[] arr){
        if(arr==null || arr.length==0)
            return null;
       int l=0,r=1,replace_index=1;
       for(l=0;l<arr.length;l++) {
           while (r < arr.length) {
               if (arr[l] != arr[r]) {
                   r++;
                   continue;
               } else {
                   int temp = arr[replace_index];
                   arr[replace_index] = arr[r];
                   arr[r] = temp;
                   replace_index++;
                   r++;
               }
           }
           l=replace_index+1;
           r=l+1;
           replace_index=l+1;
       }
       return arr;
    }

    static int[] getArraySorted(int[] arr){
        int count0=0,count1=0,count2=0,i=0;
        for(i=0;i<arr.length;i++){
            switch (arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        i=0;
        while(count0>0){
            arr[i++]=0;
            count0--;
        }
        while(count1>0){
            arr[i++]=1;
            count1--;
        }
        while(count2>0){
            arr[i++]=2;
            count2--;
        }
        for(int n:arr){
            System.out.print(n+ " ");
        }
        return arr;
    }

}
