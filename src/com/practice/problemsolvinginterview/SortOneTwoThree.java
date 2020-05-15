package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class SortOneTwoThree {
    public static void sort(int[] arr,int n){
        int mid=0;
        int low=0;
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
                    int t=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=t;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={2,1,0,2,1,0,2,1,0,2,1,0};
        int n=arr.length;
        sort(arr,n);
    }
}
