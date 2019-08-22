package com.piyush.programs.string;


public class ReverseString {
    public static void main(String[] args){
        String str="this is a test string";
        reverseStringIteratevely(str);
        System.out.println(reverseStringRecursively(str));
        System.out.println(reverseStringIteratevely(str));
    }
    static String reverseStringRecursively(String str){
        if(str.length()<2)
            return str;
        return reverseStringRecursively(str.substring(1))+str.charAt(0);
    }
    static String reverseStringIteratevely(String str){
        StringBuffer output=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
