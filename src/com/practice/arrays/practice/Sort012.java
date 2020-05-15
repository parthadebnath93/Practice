package com.practice.arrays.practice;

import java.util.Arrays;

public class Sort012 {
    public static void sortZeroOneTwo(int[] arr,int n){
        int low=0;int mid=0;int high=n-1;
        for (int i=0;i<n;i++){
            switch (arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                     temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int A[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int n=A.length;
        sortZeroOneTwo(A,n);

    }
}
