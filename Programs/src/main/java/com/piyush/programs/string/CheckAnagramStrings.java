package com.piyush.programs.string;

public class CheckAnagramStrings {
    public static void main(String[] args){
        String s1="piyush";
        String s2="uiypsh";
        String s3="bhatia";
        System.out.println(checkAnagram(s1,s2));
    }
    static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;

        char [] chars=str1.toCharArray();
        for(char c:chars){
            int index=str2.indexOf(c);
            if(index!=-1)
                str2=str2.substring(0,index)+str2.substring(index+1,str2.length());
            else
                return false;
        }
        return false;
    }
}
