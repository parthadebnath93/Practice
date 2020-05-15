package com.practice.threading;

import com.practice.problemsolving.Test;

class TestHello extends Thread{
    @Override
    public void run(){
        if (Thread.currentThread().getName().equalsIgnoreCase("thread-0")){
           // try {
               // Thread.sleep(10000);
                Thread.yield();
                System.out.println("Executing:: "+Thread.currentThread().getName());}
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
       // }
        else {
            System.out.println("Executing::::::"+Thread.currentThread().getName());
        }
    }
}
public class YeildMethodExample {
    public static void main(String[] args) {
        TestHello t=new TestHello();
        TestHello t1=new TestHello();
        t.start();
        t1.start();

    }
}
