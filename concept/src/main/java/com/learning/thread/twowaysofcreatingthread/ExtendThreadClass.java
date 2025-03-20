package com.learning.thread.twowaysofcreatingthread;

public class ExtendThreadClass extends Thread {

    public ExtendThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {

        for(; ;){

            System.out.println(Thread.currentThread().getName());
        }
    }

    



}
