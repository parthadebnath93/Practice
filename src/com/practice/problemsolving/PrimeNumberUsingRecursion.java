package com.practice.problemsolving;

public class PrimeNumberUsingRecursion {
    public static void main(String[] args) {
    int n=3;
    int i=2;
        System.out.println(isPrime(n,i)?"Prime Number":"Not a Prime Number");
    }
    public static boolean isPrime(int n,int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n,i+1);
    }
}
