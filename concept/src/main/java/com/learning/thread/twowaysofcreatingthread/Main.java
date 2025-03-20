package com.learning.thread.twowaysofcreatingthread;

public class Main {
    public static void main(String[] args){
        ExtendThreadClass th = new ExtendThreadClass("sourov"); //NEW
        th.start(); // RUNNABLE when get time from cpu it will run imediately

        
        ImplementsRunnableInterface ri = new ImplementsRunnableInterface();
        Thread t1 = new Thread(ri);
        t1.start();
        //this for loop will not give time to execution to the next loop
        //bcause these two loops are running in the same main thread. it is sequential. thats why
        //but other two threads are is not restrict the execution even if the loop is infinite
        //because multiple threads are running simultaneously
        // for(; ;){

        //     System.out.println(Thread.currentThread().getName());
        // }

        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
