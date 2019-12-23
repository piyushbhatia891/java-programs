package com.piyush.programs.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeRanges {

    public static void main(String[] args){
        Interval2[] arr={new Interval2(5,13),
                new Interval2(27,39),
                new Interval2(8,19),new Interval2(31,37)};
        printMergedArrays(arr);
    }// 31,37 27,39 8,19 5,13

    static void printMergedArrays(Interval2[] arr){
        Arrays.sort(arr, new Comparator<Interval2>() {
            @Override
            public int compare(Interval2 o1, Interval2 o2) {
                return o1.start-o2.start;
            }
        });
        Stack<Interval2> interval=new Stack<Interval2>();
        interval.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            Interval2 top=interval.peek();
            if(top.end<arr[i].start)
                interval.push(arr[i]);
            else if(top.end<arr[i].end){
                top.end=arr[i].end;
                interval.pop();
                interval.push(top);
            }
        }
        System.out.print("The Merged Intervals are: ");
        while (!interval.isEmpty())
        {
            Interval2 t = interval.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }
}

class Interval2{
    int start,end;
    Interval2(int start,int end){
        this.end=end;
        this.start=start;
    }
}
