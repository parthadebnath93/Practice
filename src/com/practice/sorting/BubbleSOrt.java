package com.practice.sorting;

public class BubbleSOrt {
    public static void printArray(int []arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void doBubbleSort(int []arr,int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        doBubbleSort(arr, n);
        System.out.print("After Bubble Sort::::");
        printArray(arr);
    }
}
