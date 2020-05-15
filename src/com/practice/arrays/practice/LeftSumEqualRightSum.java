package com.practice.arrays.practice;

import java.util.stream.IntStream;

public class LeftSumEqualRightSum {
    public static void printIndex(int[] arr,int n){
        int totalSum= IntStream.of(arr).sum();
        int sumSoFar=0;
        for (int i=0;i<n;i++){
            if (sumSoFar==totalSum-sumSoFar){
                System.out.println("Index is:::"+i);
            }
                sumSoFar+=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 6, -4, -3, 2, 3 };
        int n=arr.length;
        printIndex(arr,n);
    }
}
