package com.piyush.programs.array;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){
        String str="abcabbefg";
        System.out.println(getFirstCharacter(str));
    }

    static Character getFirstCharacter(String str){
        int counter=256,i=0;
        int[] countArray=new int[counter];
        for(i=0;i<str.length();i++){
            countArray[str.charAt(i)]++;
        }
        for(i=0;i<str.length();i++){
            if(countArray[str.charAt(i)]==1)
               return str.charAt(i);
        }
        return null;
    }
}
