package com.practice.problemsolving;

public class DecimalToDecimal {
    public static void decimalToBinary(int n){
        int i=0;
        int []arr=new int[1000];
        while(n>0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
    public static void main(String[] args) {
        int i=17;
        decimalToBinary(i);
    }
}
