package com.practice.recursion;

public class DecimalToBinary {
    public static int findBinary(int decimal){
        if(decimal==0){
            return 0;
        }
        else {
            return decimal%2+10*(findBinary(decimal/2));
        }
    }
    public static void main(String[] args) {
    int decimal=7;
        System.out.println("Binary Data is::::"+findBinary(decimal));
    }
}
