package com.practice.threading;

import com.practice.problemsolving.Test;

public class DemoTest{
    public synchronized void demo(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello From:: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t=new ThreadTest();
        Thread t1=new ThreadTest();
        t.start();
        t1.start();
    }


}
class ThreadTest extends Thread{
    @Override
    public void run(){
        DemoTest test=new DemoTest();
        test.demo();

    }
}
