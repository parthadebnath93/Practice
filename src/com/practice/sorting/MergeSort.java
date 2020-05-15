package com.practice.sorting;

public class MergeSort {
    public static void printArray(int []arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void merge(int []arr,int left,int right,int mid) {
        int n = mid - left + 1;
        int n1 = right - mid;
        int[] leftArray = new int[n];
        int[] rightArray = new int[n1];
        for (int i = 0; i < n; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n1; j++) {
            rightArray[j] = arr[mid + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n && j < n1) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else if (rightArray[j] <= leftArray[i]) {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < n) {
            arr[k++] = leftArray[i++];
        }
        while (n1 < j) {
            arr[k++] = rightArray[j++];
        }
    }
    public  static  void mergeSort(int []arr,int left,int right){
        if(left<right){
            int mid=(right+left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,right,mid);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted array is::::");
        printArray(arr);
    }
}
