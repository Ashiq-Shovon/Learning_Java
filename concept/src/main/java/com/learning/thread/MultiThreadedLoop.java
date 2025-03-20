package com.learning.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadedLoop {
    private static final int LOOP_COUNT = 1000;
    private static final int THREAD_COUNT = 3; // Number of threads
    private static final AtomicInteger counter = new AtomicInteger(0);


    public static void IterateLoop() {
        for(int i = 0; i < 1000; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            // System.out.println("from run");
        }
    }


      


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        long startTime = System.nanoTime();

        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.execute(() -> {
                StringBuilder localBuffer = new StringBuilder(); // Reduce console I/O overhead
                while (true) {
                    int current = counter.getAndIncrement();
                    if (current >= LOOP_COUNT) {
                        break;
                    }
                    localBuffer.append("Iteration: ").append(current)
                               .append(" - Thread: ").append(Thread.currentThread().getName())
                               .append("\n");
                }
                System.out.print(localBuffer.toString()); // Print once per thread
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }
        // MultiThreadedLoop.IterateLoop();
        
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }


    
}

