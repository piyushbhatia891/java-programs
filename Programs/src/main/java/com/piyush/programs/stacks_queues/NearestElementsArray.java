package com.piyush.programs.stacks_queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class NearestElementsArray {
    public static void main(String[] args){
        int[] arr={ 43, 37, 54, 42, 5, 28, 39, 20, 28};
        getSmallerElementArray(arr);
    }
    static void getSmallerElementArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> queue=new PriorityQueue(Collections.reverseOrder());
        for (int i=0; i<arr.length; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                queue.add(stack.peek());
                stack.pop();
            }

            if(!queue.isEmpty()) {
                for (int q : queue) {
                    if (q <= arr[i]) {
                        ans.add(q);
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                if(ans.size()!=i+1)
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
