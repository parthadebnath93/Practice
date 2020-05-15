package com.practice.arrays.practice;

public class MaxDifferenceBetween2Elements {
    public static void findElements(int[] arr,int n){
        int diff=Integer.MIN_VALUE;
        int maxEle=arr[n-1];
        for (int i=n-2;i>=0;i--){
            if (arr[i]>maxEle){
                maxEle=arr[i];
            }
            else {
                diff=Integer.max(diff,maxEle-arr[i]);
            }
        }
        System.out.println("Difference:::"+diff);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 5, 1, 3, 5 };
        int n=arr.length;
        findElements(arr,n);
    }
}
