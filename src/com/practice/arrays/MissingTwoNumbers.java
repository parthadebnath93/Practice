package com.practice.arrays;

import java.util.Arrays;

public class MissingTwoNumbers {
    public static void findMissingNumbers(int[] arr,int n){
        int[] a=new int[11];
        for (int i=0;i<n;i++){
            a[arr[i]]=arr[i];
        }
        for (int i=1;i<11;i++){
            if (a[i]==0){
                System.out.println("Missing Number:::"+i);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={3,5,7,9,8,2,6,10};
        int n=arr.length;
        findMissingNumbers(arr,n);
    }
}
