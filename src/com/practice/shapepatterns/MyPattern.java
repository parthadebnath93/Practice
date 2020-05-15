package com.practice.shapepatterns;

public class MyPattern {
    public static void main(String[] args) {
        int k=1;
        int n=3;
        for(int i=0;i<n;i++){
            for (int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
