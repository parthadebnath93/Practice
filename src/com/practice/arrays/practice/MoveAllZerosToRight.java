package com.practice.arrays.practice;

import java.util.Arrays;

public class MoveAllZerosToRight {
    public static void moveElements(int[] arr,int n){
        int high=n-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high--]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int A[] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int n=A.length;
        moveElements(A,n);
    }
}
