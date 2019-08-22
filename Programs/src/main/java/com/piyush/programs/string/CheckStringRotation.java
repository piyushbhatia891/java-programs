package com.piyush.programs.string;

public class CheckStringRotation {
    public static void main(String[] args){
        String str1="abcd";
        String str2="cdab";
        System.out.println(checkRotation(str1,str2));
    }
    static boolean checkRotation(String str1,String str2){
        String concated=str1.concat(str1);
        if(str1.length()!=str2.length())
            return false;
        else if(concated.indexOf(str2)!=-1)
            return true;
        return false;
    }
}
