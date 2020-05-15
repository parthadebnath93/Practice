package com.practice.threading;
 class PrintNumbers implements Runnable{
    public int number;

    @Override
    public void run() {
        printNumbers();
    }
    public synchronized void printNumbers(){
        System.out.println("hello");
        if (number==10 && Thread.currentThread().getName().equalsIgnoreCase("even")){
            System.out.println(number);
            return;
        }
        if (number%2==0 && Thread.currentThread().getName().equalsIgnoreCase("even")){
            System.out.println(number++);
        }
        else if (number%2!=0 && Thread.currentThread().getName().equalsIgnoreCase("odd")){
            System.out.println(number++);
        }
    }
}
public class PrintOddEvenNumbers {
    public static void main(String[] args) {
        Runnable r=new PrintNumbers();
        Runnable r1=new PrintNumbers();
        new Thread(r).start();
        new Thread(r1).start();
    }
}
