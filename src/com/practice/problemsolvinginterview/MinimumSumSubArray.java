package com.practice.problemsolvinginterview;

public class MinimumSumSubArray {
    public static void getMinimuSum(int[] arr,int k,int n){
        int minSum=0;
        int windowSum=0;
        int minIndex=-1,maxIndxe=-1;
        for (int i=0;i<k;i++){
            minSum+=arr[i];
        }
        windowSum=minSum;
        for (int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            if (minSum>windowSum){
                minSum=windowSum;
                minIndex=i-k+1;
                maxIndxe=i;
            }
        }
        System.out.println("Min Sum:::"+minSum+" min Index::::"+minIndex+" max index:::"+maxIndxe);
    }
    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 5, 6, 3, 8, 1 };
        int k = 3;
        int n=arr.length;
        getMinimuSum(arr,k,n);
    }
}
