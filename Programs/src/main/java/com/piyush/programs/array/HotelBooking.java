package com.piyush.programs.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HotelBooking {
    public static void main(String[] args) {
        ArrayList<Integer> arrive=new ArrayList<Integer>();
        arrive.add(1);
        arrive.add(3);
        arrive.add(5);
        ArrayList<Integer> depart=new ArrayList<Integer>();
        depart.add(2);
        depart.add(6);
        depart.add(8);
        Boolean bool=hotel(arrive,depart,1);
    }
        public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
            PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
            queue.offer(depart.get(0));
            for(int i=1;i<arrive.size();i++){
                if(arrive.get(i)>=queue.peek()){
                    queue.poll();
                    queue.offer(depart.get(i));
                }
                else{
                    queue.offer(depart.get(i));
                }
            }
            if(queue.size()>K)
                return false;

        return true;
    }
}
