package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class SortDutchFlag {
    public static void sort(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        for (int i=0;i<n;i++){
            switch (arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                     temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;

            }
        }
        System.out.println("Sorted Array is::::"+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={2,1,0,2,2,0,1,1,0,0,1,0,2,0,1,0};
        int n=arr.length;
        sort(arr,n);
    }
}
