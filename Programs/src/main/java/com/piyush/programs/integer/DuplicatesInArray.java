package com.piyush.programs.integer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args){
        int dups[]={1,2,3,3,1,4,5,2};
        findDuplicatesInArray(dups);
    }
    static void findDuplicatesInArray(int[] arr) {
        Set<Integer> repeating = new HashSet<Integer>();
        List<Integer> nonRepeating = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = arr[i];
            if (repeating.contains(c))
                continue;
            if (nonRepeating.contains(c)) {
                nonRepeating.remove(c);
                repeating.add(c);
            } else
                nonRepeating.add(c);

        }
        for(Integer val:repeating){
            System.out.println(val);
        }

    }
}
