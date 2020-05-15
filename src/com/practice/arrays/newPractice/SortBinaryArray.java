package com.practice.arrays.newPractice;

import java.util.Arrays;

public class SortBinaryArray {
    public static void sortBinaryArray(int[] arr,int n){
        int high=n-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void sortBArray(int[] arr,int n){
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                count++;
            }
        }
        for (int i=0;i<count;i++){
            arr[i]=0;
        }
        for (int i=count;i<n;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr= { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n=arr.length;
        sortBinaryArray(arr,n);
        //sortBArray(arr,n);
    }
}
