package com.practice.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Pool1 implements Runnable{

    @Override
    public void run() {

        System.out.println("Thread Pool is Executing::::"+Thread.currentThread().getName());
    }
}
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        Runnable p1=new Pool1();
        Runnable p2=new Pool1();
        Runnable p3=new Pool1();
        pool.execute(p1);
        pool.execute(p2);
        pool.execute(p3);
        pool.shutdown();
    }

}
