package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class SmallestArrayWindowToSort {
    public static void sortSmallestWindow(int[] arr,int n){
        int i;
        int j;
        for (i=1;i<n;i++){
            if (arr[i]<arr[i-1]){
                i=i-1;
                break;
            }
        }
        for(j=n-1;j>=0;j--){
            if (arr[j]<arr[j-1]){
               // j=j-1;
                break;
            }
        }
        Arrays.sort(arr,i,j+1);
        System.out.println(i+" "+j);
        for (int k:arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 7, 5, 6, 4, 8 };
        int n=arr.length;
        sortSmallestWindow(arr,n);
    }
}
