package com.practice.problemsolving;

public class SortOneTwoThree {
    public static void sortArrayInAsc(int[] arr,int end){
        int start=0;int mid=0;
        int pivot=1;
        while (mid<=end){
            if (arr[mid]<pivot){
                swap(arr,start,mid);
                mid++;
                start++;
            }
            else if (arr[mid]==pivot){
                mid++;
            }
            else if (arr[mid]>pivot){
                swap(arr,mid,end);
                end--;
            }

        }
    }
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void sortArray(int[] arr,int n){
        int low=0;
        int high=n-1;
        int mid=0;
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
    }
    public static void main(String[] args) {
        int[] arr={2,1,0,1,2,0,1,1,0,0,2,2,0};
        int n=arr.length;
       // sortArray(arr,n);
        sortArrayInAsc(arr,arr.length-1);
        printArray(arr,n);
    }
    public static void printArray(int[] arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
