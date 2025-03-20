package com.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {

    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        long result = factorial(20);
        Thread[] threads = new Thread[9];
        // creating thread pool
        ExecutorService executor = Executors.newFixedThreadPool(8);
        for(int i = 1; i <= 9; i++){
            int finalI = i;
            executor.submit(() ->{
                System.out.println(factorial(finalI));
            });
        } 

        executor.shutdown();
        try {
            while(!executor.awaitTermination(1, TimeUnit.SECONDS)){
                System.out.println("Waiting for the executor to terminate");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Result: " + result);
    }


    private static long factorial(int n) {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
