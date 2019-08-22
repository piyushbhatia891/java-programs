package com.piyush.programs.string;


public class ReverseStringSentence {
    public static void main(String[] args){
        reverseWords("welcome to india");
    }
    static void reverseWords(String str){
        String words[]=str.split(" ");
        String reversedString="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String reversedWord="";
            for(int j=word.length()-1;j>=0;j--){
                reversedWord=reversedWord+word.charAt(j);
            }
            reversedString=reversedString+reversedWord+" ";
        }
        System.out.println(reversedString);
    }
}
