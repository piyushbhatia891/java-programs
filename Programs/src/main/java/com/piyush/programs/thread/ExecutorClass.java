package com.piyush.programs.thread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorClass {
    public static void main(String[] args){
        ExecutorService service= Executors.newFixedThreadPool(10);
        service.execute(new Runnable() {
            public void run() {
                System.out.println("executing executor framework");
            }
        });
        service.shutdown();
    try {
        service = Executors.newFixedThreadPool(10);
        Future future = service.submit(new Callable() {
            public Object call() {
                System.out.println("executing executor framework");
                return "hello";
            }
        });
        System.out.println("future.get() = " + future.get());
        service.shutdown();
    }
    catch (Exception ex){

    }

        try {
            service = Executors.newFixedThreadPool(10);
            Set<Callable<String>> callables=new HashSet<Callable<String>>();
            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    return "test";
                }
            });
            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    return "test2";
                }
            });
            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    return "test3";
                }
            });

            List<Future<String>> future = service.invokeAll(callables);
            System.out.println("future.get() = " + future.get(0).get());
            service.shutdown();
        }
        catch (Exception ex){

        }


    }
}
