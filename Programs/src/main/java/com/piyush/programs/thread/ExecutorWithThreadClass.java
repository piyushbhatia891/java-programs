package com.piyush.programs.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWithThreadClass {
    public static void main(String[] args){
        ExecutorService service= Executors.newFixedThreadPool(10);
        service.execute(new ThreadTest() );
        service.shutdown();
    }
}
