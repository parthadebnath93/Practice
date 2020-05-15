package com.practice.problemsolvinginterview;

public class SlidingWindowExample {
    public static void getContinuousSum(int[] arr,int n,int k){
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int windowSum=sum;
        for (int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            sum=Integer.max(sum,windowSum);
        }
        System.out.println("Sum is:::"+sum);
    }
    public static void main(String[] args) {
        int[] arr={ 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k=4;
        int n=arr.length;
        getContinuousSum(arr,n,k);
    }
}
