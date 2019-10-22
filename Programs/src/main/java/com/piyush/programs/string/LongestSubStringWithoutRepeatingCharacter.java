package com.piyush.programs.string;

import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    static int NO_OF_CHARS=256;
    public static void main(String[] args){
        String str="GEEKSFORGEEKS";
        System.out.println(getSubStringWithoutRepeatingCharacters(str));
    }
    static int getSubStringWithoutRepeatingCharacters(String str){
        int curr_len=1;
        int max_len=1;
        int prev_index;
        int i;
        int[] visited =new int[NO_OF_CHARS];
        for(i=0;i<NO_OF_CHARS;i++){
            visited[i]=-1;
        }
        visited[str.charAt(0)]=0;
        for(i=1;i<str.length();i++){
            prev_index=visited[str.charAt(i)];
            if(prev_index==-1 || i - curr_len > prev_index)
                curr_len++;
            else{
                if(curr_len>max_len)
                    max_len=curr_len;
                curr_len=i-prev_index;
            }
            visited[str.charAt(i)]=i;
        }
        if (curr_len > max_len)
            max_len = curr_len;

        return max_len;
    }


}
