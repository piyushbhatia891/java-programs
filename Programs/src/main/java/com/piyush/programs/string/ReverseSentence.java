package com.piyush.programs.string;

public class ReverseSentence {
    public static void main(String[] args){
        String str="welcome to india";
        reverseSentence(str);
    }
    static void reverseSentence(String str){
        String words[]=str.split("\\s");
        String reverseSentence="";
        for(int i=words.length-1;i>=0;i--){
            reverseSentence=reverseSentence+words[i]+" ";
        }
        System.out.println(reverseSentence);
    }
}
