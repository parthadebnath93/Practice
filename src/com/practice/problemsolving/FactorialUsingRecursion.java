package com.practice.problemsolving;

public class FactorialUsingRecursion {
    public static int doRecursion(int n){
        if(n==1){
            return 1;
        }
        return n*doRecursion(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println("Result is:::"+doRecursion(n));
    }
}
