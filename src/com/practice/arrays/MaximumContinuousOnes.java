package com.practice.arrays;

public class MaximumContinuousOnes {
    public static void printIndexes(int[] arr,int k){
        int left=0;
        int window=0;
        int count=0;
        int leftIndex=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }
            while (count>k){
                if (arr[left]==0){
                    count--;
                }
                left++;
            }
            if (window<i-left+1){
                window=i-left+1;
                leftIndex=left;
            }
        }
        System.out.println(leftIndex+" "+(leftIndex+window-1));
    }
    public static void main(String[] args) {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        int k = 2;
        printIndexes(A,k);
    }
}
