package com.practice.recursion;

public class ProductOfTwoNumbers {
    public static int product(int x,int y){
        if(x<y){
            return product(y,x);
        }
        if(y!=0){
            return x+product(x,y-1);
        }
        else return 0;
    }
    public static void main(String[] args) {
    int x=5,y=3;
        System.out.println("Product is::::"+product(20,10));
    }
}
