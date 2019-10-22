package com.piyush.programs.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegularExpressionMatching {
    public static void main(String[] args){

    }
    static boolean getMatcherVal(String str1,String str2){
        int i=0,j=0;
        Map<Character,Integer> counts=new LinkedHashMap<Character, Integer>();
        while(i<=j){
            if(str1.charAt(i)==str2.charAt(j)
                    || str2.charAt(j)=='.'
                    || str2.charAt(j)=='*'){
                i++;
                j++;
            }
            else if(str2.charAt(j)=='.'){}


        }
        return false;
    }
}
