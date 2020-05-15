package com.practice.threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class FutureObject implements Callable {

    @Override
    public Object call() throws Exception {
        Random randomNumber=new Random();
        Integer intValue=randomNumber.nextInt(100);
        return intValue;
    }
}
public class FutureObjectTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] tasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            Callable task = new FutureObject();
            FutureTask tas=new FutureTask(task);
            tasks[i] = tas;
            Thread t = new Thread(tasks[i]);
            t.start();
        }
        for(int i=0;i<5;i++){
            System.out.println(tasks[i].get());
        }
    }
}
