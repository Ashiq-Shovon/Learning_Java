package com.learning.thread;
//implements thread by using Thread class
public class MyThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        // for(int i = 0; i < 1000; i++){
            //     System.out.println(Thread.currentThread().getName());
            System.out.println("RUNNING");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            // }
            System.out.println("from run");
    }


    public static void main(String[] args) {

        //state of my thread
        MyThread mt = new MyThread();

        System.out.println(mt.getState());
        mt.start();
        System.out.println(mt.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println(mt.getState());
        try {
            mt.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println(mt.getState());
        
        
    }

}
