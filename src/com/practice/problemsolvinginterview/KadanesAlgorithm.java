package com.practice.problemsolvinginterview;

public class KadanesAlgorithm {
    public static void KadnesAlgorithm(int[] arr,int n){
        int maxCount=0;
        int sumCount=0;
        for (int i=0;i<n;i++){
            sumCount+=arr[i];
            sumCount=Integer.max(sumCount,0);
            maxCount=Integer.max(maxCount,sumCount);
        }
        System.out.println("Result is::::"+maxCount);
    }
    public static void main(String[] args) {
        int[] arr={ -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n=arr.length;
        KadnesAlgorithm(arr,n);
    }
}
