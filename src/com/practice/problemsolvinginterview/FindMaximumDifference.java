package com.practice.problemsolvinginterview;

public class FindMaximumDifference {
    public static void findMaxDifferenceElements(int[] arr,int n){
        int max=arr[n-1];
        int diff=0;
        for (int i=n-2;i>=0;i--){
            if (arr[i]>max){
                max=arr[i];
            }
            else {
                diff=Integer.max(diff,max-arr[i]);
            }
        }
        System.out.println("Max Difference is:::"+diff);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 5, 1, 3, 5 };
        int n=arr.length;
        findMaxDifferenceElements(arr,n);
    }
}
