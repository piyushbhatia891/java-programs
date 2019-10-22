package com.piyush.programs.thread.Latch;


import java.util.concurrent.CountDownLatch;

public class WaitingThread extends  Thread{
    CountDownLatch latch=null;
    public WaitingThread(CountDownLatch latch){
        this.latch=latch;
    }
    public void run(){
        try{
            System.out.print("waiting");
            latch.await();
            System.out.print("wait over");
        }
        catch (Exception ex){

        }
    }
}
