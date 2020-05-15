package com.practice.problemsolving;

public class PrintPatternUsingRecursion {
    static int originalNumber;
    public static void printPattern(int n,int m,boolean flag){
        System.out.print(m+" ");
        if(flag==false && m==n){
            return;
        }
        if(flag){
            if(m-5>0){
                printPattern(n,m-5,true);
            }else{
                printPattern(n,m-5,false);
            }
        }
        else{
            printPattern(n,m+5,false);
        }
    }
    public static void getPatter(int n){
        if (n==0 || n<0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        getPatter(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=16;
        printPattern(n,n,true);
        getPatter(n);
    }
}
