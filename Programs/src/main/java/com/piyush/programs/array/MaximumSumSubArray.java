package com.piyush.programs.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSumSubArray {
    public static void main(String[] args){
        int[] arr={0,-1,2,7,-4,3,6};
        //getMaximumSubArray(arr);
        List<Integer> list = new ArrayList(Arrays.asList(arr));
        maxset(list);
    }

    public static ArrayList<Integer> maxset(List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();
        long sum = 0;
        long temp = 0;

        for (int num : A) {
            if (num >= 0) {
                temp += num;
                copy.add(num);
            }
            else {
                temp = 0;
                copy.clear();
            }

            if (temp > sum || (temp == sum && ans.size() < copy.size())) {
                sum = temp;
                ans.clear();
                ans.addAll(copy);
            }
        }

        return ans;
    }


    static void getMaximumSubArray(int[] arr){
        int max_total=0;
        int length=arr.length;
        int i;
        int start=0,end=0;
        int total=0;
        int elements=0;
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.<Integer>reverseOrder());
        PriorityQueue<Integer> newQ=new PriorityQueue<Integer>(Collections.<Integer>reverseOrder());
        PriorityQueue<Integer> startQueue=new PriorityQueue<Integer>();
        PriorityQueue<Integer> endQueue=new PriorityQueue<Integer>();
        boolean flag=true;
        for(i=0;i<length;i++){
            if(arr[i]>0) {
                if(flag){
                    startQueue.offer(i);
                    flag=false;
                    start=i;
                }

                total=total+arr[i];
                elements++;
            }
            else{
                flag=true;
                if (total > max_total){
                    max_total = total;
                    end=i;
                    queue.offer(elements);
                    endQueue.offer(i);
                }
                else if(total == max_total) {
                    max_total = total;
                    queue.offer(elements);
                    endQueue.offer(i);
                    if (elements > queue.peek()) {
                        queue.poll();
                        newQ.addAll(startQueue);
                        start = newQ.poll();
                        end = i - 1;
                    }
                    else if(elements== queue.peek()){
                        if(!startQueue.isEmpty()) {
                            start = startQueue.peek();
                        }
                        if(!endQueue.isEmpty()) {
                            end = endQueue.peek();
                        }
                    }

                }

            }
            if(i!=length-1) {
                total = 0;
                if (!startQueue.isEmpty()) {
                    newQ.addAll(startQueue);
                    start = newQ.peek();
                }
                end = i;
            }
        }
        System.out.println(start +" "+end);
    }


}
