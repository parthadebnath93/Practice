package com.practice.sorting;

public class SelectionSort {
    public static void doSort(int []arr,int n){

    }
    public static void printArray(int []arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n=arr.length;
        doSort(arr,n);
        System.out.println("Solution after sorting::::");
        printArray(arr);
    }
}
