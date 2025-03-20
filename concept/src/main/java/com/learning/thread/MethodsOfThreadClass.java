package com.learning.thread;

public class MethodsOfThreadClass extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 6; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getState());
        }
    }

    public static void main(String[] args) {
        MethodsOfThreadClass t1 = new MethodsOfThreadClass();
        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
    }


}
