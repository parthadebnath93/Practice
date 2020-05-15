package com.practice.arrays.newPractice;

import java.util.stream.IntStream;

public class PartitionPointForArray {
    public static void print(int[] arr,int index){
        for (int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=index;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void leftSumEqualsRightSUm(int[] arr,int n){
        int totalSum= IntStream.of(arr).sum();
        int sumSoFar=0;
        for (int i=0;i<n;i++){
            if (sumSoFar==totalSum-sumSoFar){
                print(arr,i);
            }
            sumSoFar+=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 6, -4, -3, 2, 3 };
        int n=arr.length;
        leftSumEqualsRightSUm(arr,n);
    }
}
