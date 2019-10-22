package com.piyush.programs.array;


public class LongestPrefixForAString {
    public static void main(String[] args){
        String[] strArray={"flower","flight","driver"};
        System.out.println(getCommonPrefix(strArray));
    }
    static String getCommonPrefix(String[] strs){
        int i=0;
        if(strs.length==0 || null==strs)
            return null;
        while(true){
            boolean flag=true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                i++;
            else
                break;
        }
        if(i==0)
            return "no common prefix";
        else
            return strs[0].substring(0,i);
    }
}
