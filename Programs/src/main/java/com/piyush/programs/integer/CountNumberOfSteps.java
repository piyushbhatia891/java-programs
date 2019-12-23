package com.piyush.programs.integer;

public class CountNumberOfSteps {
    public static void main(String[] args){
        int n=4;
        System.out.println("Total ways to jump 4 stairs :"+getTotalSteps(n+1));
    }
    static int getTotalSteps(int stairs){
        if(stairs<=1)
            return stairs;
        int steps=getTotalSteps(stairs-1);
        int step2=getTotalSteps(stairs-2);
        return steps+step2;
    }
}
