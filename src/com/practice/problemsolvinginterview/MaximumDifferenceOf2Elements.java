package com.practice.problemsolvinginterview;

public class MaximumDifferenceOf2Elements {
    public static void finMaxDifference(int[] arr,int n){
       int maxDiff=arr[n-1];
       int diff=Integer.MIN_VALUE;
       for (int i=n-2;i>=0;i--){
           if (arr[i]>maxDiff){
            maxDiff=arr[i];
           }
           else {
               diff=Integer.max(diff,maxDiff-arr[i]);
           }
       }
        System.out.println("Difference is::::"+diff);

    }
    public static void main(String[] args) {
        int[] arr={2,7,9,5,1,3,5};
        int n=arr.length;
        finMaxDifference(arr,n);
    }
}
