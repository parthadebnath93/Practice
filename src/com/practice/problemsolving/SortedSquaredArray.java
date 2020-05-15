package com.practice.problemsolving;

import java.util.Vector;

public class SortedSquaredArray {
    public static int [] sortSquaredArray(int []arr,int n){
        int []result=new int[n];
        int left=0;
        int right=n-1;
        for (int i=n-1;i>=0;i--){
            if(Math.abs(arr[left])>arr[right]){
                result [i]=arr[left]*arr[left];
                left++;
            }
            else {
                result[i]=arr[right]*arr[right];
                right--;
            }
        }
        return result;
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    int []arr={-6,-4,1,2,4,5};
    int n=arr.length;
    int []result=sortSquaredArray(arr,n);
        System.out.println("Result is:::::");
    printArray(result);
        Vector<Integer>vec=new Vector<>();
        vec.size();
    }
}
