package com.practice.problemsolving;

public class MultiplesOfArrayElements {
    public static int division(int n,int m){
        if(n==0){
            return 0;
        }
        if(m==0){
            return Integer.MAX_VALUE;
        }
        boolean negNumber=false;
        if(n<0){
            n=-n;
            if(m<0){
                m=-m;
            }
            else {
                negNumber=true;
            }
        }
        else if(m<0) {
            m=-m;
            negNumber=true;
        }
        int quotient=0;
        while (n>=m){
            n=n-m;
            quotient++;
        }
        if(negNumber){
            quotient=-quotient;
        }
        return quotient;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int multiply=1;
        for (int i:arr){
            multiply *=i;
        }
        for (int i:arr){
            System.out.println(division(multiply,i));
        }
    }
}
