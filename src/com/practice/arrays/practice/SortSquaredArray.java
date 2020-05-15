package com.practice.arrays.practice;

import java.util.Arrays;

public class SortSquaredArray {
    public static void sortSquaredArray(int[] arr,int n){
        int[]ar=new int[n];
        int low=0;int high=n-1;
        for (int i=n-1;i>=0;i--){
            if (Math.abs(arr[low])>Math.abs(arr[high])){
                ar[i]=arr[low]*arr[low];
                low++;
            }
            else {
                ar[i]=arr[high]*arr[high];
                high--;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int []arr={-6,-4,1,2,4,5};
        int n=arr.length;
        sortSquaredArray(arr,n);
    }
}
