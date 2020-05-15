package com.practice.arrays.practice;

public class Replace0ToFormLargestSubArrayOf1 {
    public static void findSubArray(int[]arr,int n) {
        int maxLength=0;
        int count=0;
        int previousLength=-1;
        int maxIndex=-1;
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                count++;
            }
            else {
                count=i-previousLength;
                previousLength=i;
            }
            if (maxLength<count){
                maxIndex=previousLength;
                maxLength=count;
            }
        }
        System.out.println(maxIndex);
    }
    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int n=A.length;
        findSubArray(A,n);
    }
}
