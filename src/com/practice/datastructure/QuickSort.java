package com.practice.datastructure;

public class QuickSort {
    public int partition(int []arr,int left,int right){
        int i=left-1;
        int pivot=arr[right];
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            }
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
    public void sort(int []arr,int l,int r){
        if(l<r){
            int pi=partition(arr,l,r);
            sort(arr,l,pi-1);
            sort(arr,pi+1,r);
        }
    }
    public void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n=arr.length;
        QuickSort sort=new QuickSort();
        sort.sort(arr,0,n-1);
        sort.printArray(arr);
    }
}
