package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.learning.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread m1 = new MyThread(); //NEW
        System.out.println(m1.getState());
        m1.start(); //RUNNABLE IT CAN RUN WHEN CPU WILL GIVE TIME IT WILL RUN 
        System.out.println(m1.getState());
        Thread.sleep(100);
        System.out.println(m1.getState());
        m1.join();
        System.out.println(m1.getState());
        

   

        System.out.println("Hello world!");
        // List<String[]> str = new ArrayList<>(
        //     Arrays.asList(new String[]{"haniv", "sami"}));

            List<String[]> str = new ArrayList<>(Arrays.asList(new String[]{"d", "d"}, new String[]{"dd"}));
            List<String> ss = new ArrayList<>(Arrays.asList("a"));
            ss.add("d");
            str.add(new String[]{"fahim"});
        // str.add(["d", "d"]);
        for(String s : ss) {
            System.out.println(s);
        }
        // for(int i = 0; i < 1000; i++){
        //     System.out.println(Thread.currentThread().getName());
        // }


        // for(String[] s : str){
        //     System.out.println(s);
        // }

        //start, run, sleep, join, setPriority
    }
}