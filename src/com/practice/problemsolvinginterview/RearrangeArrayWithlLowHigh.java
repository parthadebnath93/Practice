package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class RearrangeArrayWithlLowHigh {
    public static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void rearrange(int[] arr){
        for (int i=1;i<arr.length;i+=2){
            if (arr[i-1]>arr[i]){
                swap(arr,i+1,i);
            }
            if (i+1<arr.length && arr[i+1]>arr[i]){
                swap(arr,i+1,i);
            }
        }
        for (int data:arr
             ) {
            System.out.print(data+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={ 9, 6, 8, 3, 7 };
        rearrange(arr);
    }
}
