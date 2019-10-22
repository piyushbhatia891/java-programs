package com.piyush.programs.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompleteAbleFutureClass {
    public static void main(String[] args){
        ExecutorService service= Executors.newFixedThreadPool(2);
        /*CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
           System.out.println("test");
           return "val";
        },service);*/

    }
}
