package com.learning.thread;

public class MultiThread extends Thread {

    public MultiThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 6; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("count: " + i + " " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        MultiThread t1 = new MultiThread("first");
        MultiThread t2 = new MultiThread("second");
        MultiThread t3 = new MultiThread("third");
        t1.start();
        t2.start();
        t3.start();

        try {  
            t1.join();  
            t2.join();  
            t3.join();  
        } catch (InterruptedException e) {  
            System.out.println("Main thread interrupted.");  
        }  
        System.out.println("All threads have finished.");  
    }
}
