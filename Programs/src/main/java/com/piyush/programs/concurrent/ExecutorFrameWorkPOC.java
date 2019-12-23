package com.piyush.programs.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWorkPOC {
    public static void main(String[] args)throws ExecutionException,InterruptedException{
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable block");
            }
        };

        Callable callable=new Callable() {
            @Override
            public Object call() throws Exception {
                return "inside callable Object";
            }
        };


        ExecutorService executorServiceForExecutor=Executors.newFixedThreadPool(1);
        executorServiceForExecutor.execute(runnable);

        System.out.println(executorServiceForExecutor.submit(callable).get());


        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(1);
        /*
        Scheduling runnable task in executor service
         */
        executorService.schedule(runnable,5, TimeUnit.MILLISECONDS);
        /*
        Scheduled task ended
         */
        System.out.println("Is executor service shutdown now? "+executorService.isShutdown());

        ScheduledFuture<String> val=executorService.schedule(callable,5,TimeUnit.MILLISECONDS);
        System.out.println(val.get());
        if(!executorService.isShutdown())
            executorService.shutdownNow();
    }
}
