package com.piyush.programs.string;

/**
 * Created by piyushbha on 8/13/2019.
 */
public class CapitalsAtLast {

    public static void main(String[] args){
        String str="This is test One ";
        capitalsAtLast(str);
    }
    static void capitalsAtLast(String str){
        StringBuilder first=new StringBuilder();
        StringBuilder last=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A' && c<='Z'){
                last.append(c);
            }
            else
                first.append(c);
        }
        System.out.println(first.toString()+last.toString() );
    }
}
