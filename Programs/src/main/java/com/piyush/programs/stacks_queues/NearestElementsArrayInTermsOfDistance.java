package com.piyush.programs.stacks_queues;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class NearestElementsArrayInTermsOfDistance {
    public static void main(String[] args){
        int[] arr={ 43, 37, 54, 42, 5, 28, 39, 20, 28};
        getSmallerElementArray(arr);
    }
    static void getSmallerElementArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<arr.length; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans.add(stack.peek());
            }
            else {
                ans.add(-1);
            }

            stack.push(arr[i]);
        }
        ans.forEach(val->System.out.println(val));
    }
}
