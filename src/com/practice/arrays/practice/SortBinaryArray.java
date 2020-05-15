package com.practice.arrays.practice;

import java.util.Arrays;

public class SortBinaryArray {
    public static void sortBinaryArrayProcess1(int[] arr,int n){
        int low=0;int high=n-1;
        while (low<high){
            if (arr[low]==0){
                low++;
            }
            if (arr[high]==1){
                high--;
            }
            if (arr[low]==1){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high--]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void sortBinaryArrayProcess2(int[] arr,int n){
        int countZero=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                countZero++;
            }
        }
        for (int i=0;i<n;i++){
            if (i<countZero){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n=A.length;
        sortBinaryArrayProcess1(A,n);
        int[] arr={ 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sortBinaryArrayProcess2(arr,n);
    }
}
