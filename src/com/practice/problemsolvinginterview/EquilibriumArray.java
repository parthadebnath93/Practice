package com.practice.problemsolvinginterview;

import java.util.stream.IntStream;

public class EquilibriumArray {
    public static void getEquilibriumIndex(int[] arr){
        int sum=IntStream.of(arr).sum();
        int right=0;
        for (int i=arr.length-1;i>=0;i--){
            if (right==sum-(arr[i]+right)){
                System.out.println("Index is:::"+i);
            }
            right+=arr[i];
        }
    }
    public static void getEquilibriumIndexes(int[] arr,int n){
        int[] left=new int[n];
        left[0]=0;
        for (int i=1;i<arr.length;i++){
            left[i]=left[i-1]+arr[i-1];
        }
        int right=0;
        for (int i=n-1;i>=0;i--){
            if (left[i]==right){
                System.out.println("Equilibrium indexis::::"+i);
            }
            right+=arr[i];
        }

    }
    public static void main(String[] args) {
      int[] arr= { 0, -3, 5, -4, -2, 3, 1, 0 };
        getEquilibriumIndex(arr);
        getEquilibriumIndexes(arr,arr.length);
    }
}
