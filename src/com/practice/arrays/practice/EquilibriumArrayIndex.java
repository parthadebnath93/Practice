package com.practice.arrays.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EquilibriumArrayIndex {
    public static void printEquilibriumIndex(int[] arr,int n){
        int totalSum=IntStream.of(arr).sum();
        int[] sum=new int[n];
        int S=0;
        for (int i=0;i<n;i++){
            S+=arr[i];
            sum[i]=S;
        }
        for (int i=0;i<n;i++){
            int leftSum=sum[i]-arr[i];
            int rightSUm=totalSum-sum[i];
            if (leftSum==rightSUm){
                System.out.println("Index:::"+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] A = { 0, -3, 5, -4, -2, 3, 1, 0 };
        int n=A.length;
        printEquilibriumIndex(A,n);
    }
}
