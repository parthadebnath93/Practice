package com.practice.arrays.practice;

import java.util.Arrays;

public class SortArrayWithOneSingleLoop {
    public static void sort(int[]arr,int n){
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        int n=arr.length;
        sort(arr,n);
    }
}
