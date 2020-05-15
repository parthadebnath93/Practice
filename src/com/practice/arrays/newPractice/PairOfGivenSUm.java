package com.practice.arrays.newPractice;

import java.util.HashSet;
import java.util.Set;

public class PairOfGivenSUm {
    public static void printPairs(int[] arr,int n,int sum){
        Set<Integer>set=new HashSet<>();
        for (int i=0;i<n;i++){
            int temp=sum-arr[i];
            if (set.contains(temp)){
                System.out.println("Pair is:::"+temp+"  "+arr[i]);
            }
            set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        int n=arr.length;
        printPairs(arr,n,sum);

    }
}
