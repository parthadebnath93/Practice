package com.practice.arrays.practice;

import java.util.Arrays;

public class AlternativeHighAndLow {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void rearrangeArray(int[] arr,int n){
        for (int i=1;i<n;i+=2 ){
            if (arr[i]<arr[i-1]){
                swap(arr,i,i-1);
            }
            if (arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] A = { 9, 6, 8, 3, 7 };
        int n=A.length;
        rearrangeArray(A,n);
    }
}
