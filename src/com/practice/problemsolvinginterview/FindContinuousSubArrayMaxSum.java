package com.practice.problemsolvinginterview;

public class FindContinuousSubArrayMaxSum {
    public static void printElements(int[] arr,int n){
        int maxSum=0;
        int sumSoFar=0;
        for (int i=0;i<n;i++){
            sumSoFar+=arr[i];
            sumSoFar=Integer.max(sumSoFar,0);
            maxSum=Integer.max(sumSoFar,maxSum);
        }
        System.out.println("Max Sum is::::"+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        printElements(arr,arr.length);
    }
}
