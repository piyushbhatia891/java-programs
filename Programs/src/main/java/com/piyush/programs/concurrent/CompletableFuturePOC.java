package com.piyush.programs.concurrent;

import java.util.ConcurrentModificationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePOC {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
        CompletableFuture<Void> future=CompletableFuture.supplyAsync(()->"hello")
                //.handle((s,t)->s!=null  ? s: "hello stranger")
                .thenApply(s->s+"world")
                .thenAccept(s->System.out.println(s));


        /*
        ThenCompose function basically connects the out put of one future
        objects to other in chain
        ThenCombine basically runs two completeable future instances and
        combines their out put
         */
        CompletableFuture<Void> completableFutureString=CompletableFuture
                .supplyAsync(()->"hellow")
                .thenCombine(CompletableFuture.supplyAsync(()->"world"),(s1,s2)->s1+s2)
                .thenAccept(s->System.out.println(s));
        future.get();
        completableFutureString.get();
    }
}
