package com.piyush.programs;

import java.util.HashMap;

/**
 * Created by piyushbha on 2/28/2019.
 */
public class IsomorphicStrings {
    public static void main(String[] args){
        boolean res=isoMorphic("aab","xxy");
        System.out.println(res);
    }
    static boolean isoMorphic(String str1,String str2){
        int str1Length=str1.length();
        int str2Length=str2.length();
        if(str1Length!=str2Length || (str1==null || str2==null))
            return false;

        HashMap<Character,Character> characterMap=new HashMap<Character, Character>();
        for(int i=0;i<str1Length;i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if(characterMap.containsKey(c1)){
                if (characterMap.get(c1)!=c2)
                    return false;
            }
            else {
                if (characterMap.containsValue(c2))
                    return false;
                characterMap.put(c1,c2);
            }
        }
        return true;
    }
}
