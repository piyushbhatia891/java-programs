package com.piyush.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(-2);
        list.add(-3);
        list.add(-4);
        list.add(9);
        System.out.println(maxSum(list));
    }
    static int maxSum(List<Integer> list) {
        int size = list.size();
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + list.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
