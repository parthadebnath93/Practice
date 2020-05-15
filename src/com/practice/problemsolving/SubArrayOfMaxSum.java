package com.practice.problemsolving;

public class SubArrayOfMaxSum {
    public static void findMaxSum(int[] arr,int n,int k){
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int windowSum=sum;
        for (int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            sum=Integer.max(windowSum,sum);
        }
        System.out.println("Max sum is::::"+sum);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int k=3;
        findMaxSum(arr,n,k);
    }
}
