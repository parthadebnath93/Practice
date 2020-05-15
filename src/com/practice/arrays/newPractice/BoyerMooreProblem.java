package com.practice.arrays.newPractice;

public class BoyerMooreProblem {
    public static void find(int[] arr,int n){
        int element=arr[0];
        int count=0;
        for (int i=0;i<n;i++){
            if (element==arr[i]){
                count++;
            }
            else {
                count--;
                if (count==0){
                    element=arr[i];
                    count++;
                }
            }
        }
        System.out.println("Element is::::"+element);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        int n=arr.length;
        find(arr,n);
    }
}
