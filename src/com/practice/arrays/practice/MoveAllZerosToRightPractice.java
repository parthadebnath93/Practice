package com.practice.arrays.practice;

import java.util.Arrays;

public class MoveAllZerosToRightPractice {
    public static void moveAllZeros(int[] arr,int n){
        int high=arr.length-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int A[] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int n=A.length;
        moveAllZeros(A,n);
    }
}
