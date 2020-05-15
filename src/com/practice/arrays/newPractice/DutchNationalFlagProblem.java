package com.practice.arrays.newPractice;

import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void sort(int[] arr,int n){
        int low=0,mid=0;
        int high=n-1;
        for (int i=0;i<n;i++){
            switch (arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low++]=arr[mid];
                    arr[mid++]=temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high--]=temp;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={ 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int n=arr.length;
        sort(arr,n);
    }
}
