package com.piyush.programs.string;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringLength {
    public static void main(String[] args){
        String s1="abbbc";
        System.out.println(findLargestLengthSubString(s1));
    }

    static int findLargestLengthSubString(String s1){
        int ans=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                if(allUnique(s1,i,j))
                    ans= Math.max(ans,j-i);
            }
        }
        return ans;
    }
    static boolean allUnique(String s1,int start,int end){
        Set<Character> charList=new HashSet<Character>();
        for(int i=start;i<end;i++){
            Character ch=s1.charAt(i);
            if(charList.contains(ch))
                return false;
            charList.add(ch);
        }
        return true;
    }

}

