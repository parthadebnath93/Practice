package com.practice.problemsolving;

public class FibonacciSerisUsingRecursion {
    public static int getFibonacciSeries(int n){
        if(n<=1){
            return n;
        }
        return getFibonacciSeries(n-1)+getFibonacciSeries(n-2);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println("Fibonacci Number is::::"+getFibonacciSeries(n));
    }
}
