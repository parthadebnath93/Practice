package com.practice.problemsolvinginterview;

public class GivenSumSubArray {
    public static void getSubArray(int[] arr,int n,int s){
        int windowSum=0;
        int low=0;int high=0;
        for (low=0;low<arr.length;low++){
            while (windowSum<s && high<n){
                windowSum+=arr[high++];
            }
            if (s==windowSum){
                System.out.println("Indexes are:::"+low+" "+(high-1));
            }
            windowSum-=arr[low];
        }
    }
    public static void main(String[] args) {
        int[] A = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
        int sum = 15;
        int n=A.length;
        getSubArray(A,n,sum);
    }
}
