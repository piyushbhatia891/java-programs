package com.piyush.programs.array;

import java.util.Iterator;
import java.util.Vector;

public class IncrementArray {
    public static void main(String[] args){
        Vector<Integer> vector=new Vector<>();
        vector.add(1);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        int n=vector.size();
        vector.set(n-1,vector.get(n-1)+1);
        int carry=vector.get(n-1)/10;
        vector.set(n-1,vector.get(n-1)%10);
        for(int i=n-2;i>=0;i--){
            if(carry==1){
                vector.set(i,vector.get(i)+carry);
                carry=vector.get(i)/10;
                vector.set(i,vector.get(i)%10);
            }

        }
        if (carry == 1)
            vector.add(0, 1);
        Iterator<Integer> it = vector.iterator();
        int j = 0;
        while (it.hasNext() && it.next() == 0) {
            ++j;
        }
        vector.subList(0, j).clear();
        for (int i = 0; i < vector.size(); i++)
            System.out.print(vector.get(i) + " ");
    }
}

