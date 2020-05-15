package com.practice.problemsolvinginterview;

public class SubArrayToFindSumGreaterThanGivenSum {
    public static void printMinSubArray(int[] arr,int S){
        int sum=0;
        int low=0;
        int length=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            while (S<sum && low<i){
                System.out.println("Hello");
                length=Integer.min(length,i-low+1);
                sum-=arr[low];
                low++;
            }
        }
        System.out.println("Length is:::"+length+" ");
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 21;
        printMinSubArray(A,k);
    }
}
