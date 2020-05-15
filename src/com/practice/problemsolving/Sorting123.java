package com.practice.problemsolving;

public class Sorting123 {
    public static void sortArray(int []arr,int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;

            }
        }
    }
    public static void printArray(int []arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sortArray(arr, arr.length);
        System.out.println("Sorted Array is:::::");
        printArray(arr);
    }
}
