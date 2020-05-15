package com.practice.arrays.practice;

import java.util.Arrays;

public class InsertionSOrt {
    public static void sort(int[] arr,int n){
       for (int i=1;i<n;i++){
           int key=arr[i];
           int j=i-1;
           while (j>=0 && arr[j]>key){
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
       }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        int n=arr.length;
        sort(arr,n);
    }
}
