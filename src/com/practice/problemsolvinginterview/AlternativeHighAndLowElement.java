package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class AlternativeHighAndLowElement {
    public static void alternativeHighLow(int[] arr,int n){
        for (int i=1;i<n-1;i=i+2){
            if (arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            if (arr[i]<arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] A = { 9, 6, 8, 3, 7 };
        int n=A.length;
        alternativeHighLow(A,n);
    }
}
