package com.piyush.programs.thread.Latch;

import java.util.concurrent.CountDownLatch;

public class DecrementerThread extends Thread {
    CountDownLatch latch=null;
    public DecrementerThread(CountDownLatch latch){
        this.latch=latch;
    }
    public void run(){
        try{
            System.out.print("starting decrementing");
            latch.countDown();
            latch.countDown();
            latch.countDown();
            System.out.print("decremented");
        }
        catch (Exception ex){

        }
    }
}

