package com.piyush.programs.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String str="teste";
        nonRepeatingCharacter(str);
        nonRepeatingCharacterWithOneForLoop(str);
    }
    static  void nonRepeatingCharacterWithOneForLoop(String str){
        Set<Character> repeating=new HashSet<Character>();
        List<Character> nonRepeating=new ArrayList<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(repeating.contains(c))
                continue;
            if(nonRepeating.contains(c))
            {
                nonRepeating.remove((Character)c);
                repeating.add(c);
            }
            else
                nonRepeating.add(c);

        }
    System.out.println(nonRepeating.get(0));
    }
    static void nonRepeatingCharacter(String str){
        Map<Character,Integer> charCounts=new LinkedHashMap<Character, Integer>();
        for (int i=0;i<str.length();i++){
            if(charCounts.containsKey(str.charAt(i)))
                charCounts.put(str.charAt(i),charCounts.get(str.charAt(i))+1);
            else
                charCounts.put(str.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> entry:charCounts.entrySet()){
            if(entry.getValue()==1)
                System.out.println(entry.getKey());
        }


    }
}
