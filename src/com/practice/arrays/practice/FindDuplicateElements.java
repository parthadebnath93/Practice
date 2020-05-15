package com.practice.arrays.practice;

import java.util.stream.IntStream;

public class FindDuplicateElements {
    public static void findDuplicate(int[] arr,int n){
        int expectedSum= (n*(n-1))/2;
        int actualSum=0;
        for (int i=0;i<n;i++){
            actualSum+=arr[i];
        }
        System.out.println("Duplicate Element is:::"+(actualSum-expectedSum));
    }
    public static void findDuplicates(int[] arr,int n){
        int expected=0;
        for (int i=1;i<n;i++){
            expected =i^(i+1);
        }
        System.out.println(expected);
        int actual=1;
        for (int i=0;i<n-1;i++){
            actual=arr[i]^arr[i+1];
        }
        System.out.println(actual);
        System.out.println(expected^actual);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int n=arr.length;
        findDuplicate(arr,n);
        findDuplicates(arr,n);
    }
}
