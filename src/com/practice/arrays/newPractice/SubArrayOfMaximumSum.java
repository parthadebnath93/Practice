package com.practice.arrays.newPractice;

public class SubArrayOfMaximumSum {
    public static void maxSum(int[] arr,int n,int k){
        int sum=0;
        int lastIndex=-1;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int windowSum=sum;
        for (int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            if (windowSum>sum){
                sum=windowSum;
                lastIndex=i;
            }
        }
        System.out.println("Max SUm is::::"+sum);
        for (int i=lastIndex-k+1;i<=lastIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,5,4,1};
        int n=arr.length;
        int k=3;
        maxSum(arr,n,k);
    }
}
