package com.piyush.programs.thread.Latch;

import com.piyush.programs.thread.ThreadTest;

import java.util.concurrent.CountDownLatch;

public class LatchExample {
    public static void main(String[] args){
        CountDownLatch latch=new CountDownLatch(5);
        WaitingThread waitingThread=new WaitingThread(latch);
        DecrementerThread decrementerThreadThread=new DecrementerThread(latch);
        waitingThread.start();
        decrementerThreadThread.start();
    }
}
