package com.practice.recursion;

public class BubbleSort {
    public static void doBubbleSort(int []arr,int n){
        if(n==1){
            return;
        }
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        doBubbleSort(arr,n-1);
    }
    public static void printArray(int []arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={2,1,5,4,7,10};
        doBubbleSort(arr,arr.length);
        printArray(arr);
    }
}
