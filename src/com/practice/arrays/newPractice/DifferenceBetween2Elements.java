package com.practice.arrays.newPractice;

public class DifferenceBetween2Elements {
    public static void findMaxDifference(int[] arr,int n){
        int diff=0;
        int maxElement=arr[n-1];
        for (int i=n-2;i>=0;i--){
            if (maxElement<arr[i]){
                maxElement=arr[i];
            }
            else {
                diff=Integer.max(diff,maxElement-arr[i]);
            }
        }
        System.out.println("Difference is:::"+diff);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 5, 1, 3, 5 };
        int n=arr.length;
        findMaxDifference(arr,n);
    }
}
