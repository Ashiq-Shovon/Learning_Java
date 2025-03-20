package com.learning.thread;

public class ThreadWithFactorial {

    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        long result = factorial(20);
        Thread[] threads = new Thread[9];
        for(int i = 1; i <= 9; i++){
            int finalI = i;
            threads[i-1] = new Thread(() ->{
                System.out.println(factorial(finalI));
            });
            threads[i-1].start();
        }   

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
