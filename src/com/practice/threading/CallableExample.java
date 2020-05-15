package com.practice.threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable {
    @Override
    public Object call() throws InterruptedException {
        Random random=new Random();
        Integer i=random.nextInt(100);
        Thread.sleep(1000);
          return i.intValue();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] tasks=new FutureTask[5];
        for (int i=0;i<tasks.length;i++){
            CallableExample exam=new CallableExample();
            tasks[i]=new FutureTask(exam);
            Thread t=new Thread(tasks[i]);
            t.start();
        }
        for (int i=0;i<5;i++){
            Integer val=(Integer) tasks[i].get();
            System.out.println(val);
        }
    }
}
