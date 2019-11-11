package com.piyush.programs.hashing;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColourfulNumber {
    public static void main(String[] args){
        int color=getColorOfInt(12);
        System.out.println(color);
    }
    static int getColorOfInt(int num){
        String str=Integer.toString(num);
        List<String> numIntList= new ArrayList<String>();
        int l=0,r=1,i=0;
        StringBuilder initialString=new StringBuilder();
        StringBuilder remainingString=new StringBuilder();
        int resultantProduct=Integer.MIN_VALUE;
        for(i=0;i<str.length();i++)
            numIntList.add(Character.toString(str.charAt(i)));
        while(l<str.length()){
            for(r=l+1;r<str.length();r++){
                remainingString.append(Character.toString(str.charAt(r)));
                initialString.append(Character.toString(str.charAt(l)).concat(remainingString.toString()));
                numIntList.add(initialString.toString());
                initialString.delete(0,initialString.length());
            }
            l++;
            r=l+1;
            remainingString.delete(0,remainingString.length());
        }
        Comparator c = new Comparator<String>()
        {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        Collections.sort(numIntList, c);
        /*numIntList=Stream.of(numIntList)
                .flatMap(Collection::stream)
                .sorted( Comparator.comparing( String::length))
                .collect(Collectors.toList());*/
        String[] resultArray=numIntList.toArray(new String[numIntList.size()]);
        for(l=0;l<resultArray.length;l++){
            int product=1;
            char[] character=resultArray[l].toCharArray();
            for(i=0;i<character.length;i++){
                product=product*(Integer.parseInt(Character.toString(character[i])));

            }
            if(product <=resultantProduct)
                return 0;
            else
                resultantProduct=product;
        }
        return 1;
    }

    static int getColor2(int A){
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }

        Collections.reverse(numbers);
        int n = numbers.size();

        for (int i = 0; i < n; i++) {
            int prod=1;
            for (int j = i; j < n; j++) {

                prod = prod * numbers.get(j);
                if (hashSet.contains(prod))
                    return 0;
                hashSet.add(prod);
            }
        }

        return 1;
    }
}
