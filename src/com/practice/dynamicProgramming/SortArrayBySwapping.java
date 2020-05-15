package com.practice.dynamicProgramming;

import java.util.Arrays;

public class SortArrayBySwapping {
    public static void sortBySwapping(int[] arr,int n){
        int min=-1;
        int max=-1;
        for (int i=0;i<n-2;i++){
            if (arr[i]>arr[i+1]){
                max=i;
            }
        }
        for (int i=n-1;i>=1;i--){
            if (arr[i]<arr[i-1]){
                min=i;
                break;
            }
        }
        int temp=arr[min];
        arr[min]=arr[max];
        arr[max]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 9, 8, 7 };
        int n=arr.length;
        sortBySwapping(arr,n);
    }
}
