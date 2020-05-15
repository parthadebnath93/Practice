package com.practice.sorting;

public class QuickSort {
    public static int partition(int []arr,int left,int right){
        int i=left-1;
        int pivot=arr[right];
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
    public static void quickSort(int []arr,int left,int right){
        if(left<right){
            int pi=partition(arr,left,right);
            quickSort(arr,left,pi-1);
            quickSort(arr,pi+1,right);
        }
    }
    public static void printArrar(int []arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n=arr.length;
        quickSort(arr,0,n-1);
        System.out.println("Sorted Array is::::");
        printArrar(arr);
    }
}
