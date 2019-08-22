package com.piyush.programs.string;

public class InsertStringAtSpecificIndex {
    public static void main(String[] args){
        String str="GeeksGeeks";
        addStringAtSpecifcIndex(str,"For",4);
    }
    static void addStringAtSpecifcIndex(String str1,String str2,int index){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(i==index)
                builder.append(str2.toCharArray());
            else
                builder.append(str1.charAt(i));
        }
        System.out.println(builder.toString());

    }
}
