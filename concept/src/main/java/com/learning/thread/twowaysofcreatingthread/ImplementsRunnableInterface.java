package com.learning.thread.twowaysofcreatingthread;

public class ImplementsRunnableInterface implements Runnable {



    @Override
    public void run() {

        for(; ;){

            System.out.println(Thread.currentThread().getName());
        }
    }

}
