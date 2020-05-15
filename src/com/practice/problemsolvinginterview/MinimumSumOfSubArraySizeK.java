package com.practice.problemsolvinginterview;

public class MinimumSumOfSubArraySizeK {
    public static void printMinimumSumSubArray(int[] arr,int k){
        int sum=0;
        int startIndex=0;
        int endIndex=k-2;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int windowSum=sum;
        for (int i=k;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-k];
            if (windowSum<sum){
                startIndex=i-k+1;
                endIndex=i;
                sum=windowSum;
            }
        }
        System.out.println("Lowest Sum of Subarray is::::"+sum+" Array is:::");
        for (int i=startIndex;i<=endIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 5, 6, 3, 8, 1};
        int k = 3;
        printMinimumSumSubArray(arr,k);
    }
}
