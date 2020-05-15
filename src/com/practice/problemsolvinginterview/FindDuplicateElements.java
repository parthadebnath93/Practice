package com.practice.problemsolvinginterview;

import java.util.stream.IntStream;

public class FindDuplicateElements {
    public static void printDuplicate(int[] arr,int n){
        int sum=(n*(n-1))/2;
        int a=IntStream.of(arr).sum()-sum;
        System.out.println("Duplicate element is::::"+a);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int n=arr.length;
        printDuplicate(arr,n);
    }
}
