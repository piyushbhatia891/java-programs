package com.piyush.programs.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomArray {
    public static void main(String[] args){
        int[][] meetingArray={{5,10},{7,30}};
        Arrays.sort(meetingArray, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<Integer> minTimes=new PriorityQueue<Integer>();
        minTimes.offer(meetingArray[0][1]);
        for(int i=1;i<meetingArray.length;i++){
            if(meetingArray[i][0]>=minTimes.peek()){
                minTimes.poll();
                minTimes.offer(meetingArray[i][1]);
            }
            else{
                minTimes.offer(meetingArray[i][1]);
            }
        }
        System.out.println(minTimes.size());
    }
}
