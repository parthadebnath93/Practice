package com.practice.arrays.newPractice;

import java.util.stream.IntStream;

public class EquilibriumTest {
    public static void getEquilibriumIndex(int[] arr,int n){
        int totalSum= IntStream.of(arr).sum();
        int S=0;
        int[] sum=new int[n];
        for (int i=0;i<n;i++){
            S+=arr[i];
            sum[i]=S;
        }
        for (int i=0;i<n;i++){
            int leftSum=sum[i]-arr[i];
            int rightSum=totalSum-sum[i];
            if (leftSum==rightSum){
                System.out.println("Index::::"+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] A = { 0, -3, 5, -4, -2, 3, 1, 0 };
        int n=A.length;
        getEquilibriumIndex(A,n);
    }
}
