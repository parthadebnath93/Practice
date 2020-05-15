package com.practice.recursion;

public class PrintOddEvenNumbers {
    public static void printOddEven(int n){
        if (n==10){
            System.out.println("Even Number::::"+n);
            return;
        }
        if (n%2==0){
            System.out.println("Even Number:::"+n);
        }
        else {
            System.out.println("Odd Number::::"+n);
        }
        printOddEven(n+1);
    }
    public static void main(String[] args) {
        printOddEven(1);
    }
}
