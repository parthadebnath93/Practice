package com.practice.problemsolvinginterview;

public class ContinousOneByReplacingZero {
    public static void countZeros(int[] arr,int n,int k){
        int count=0;
        int windowCount=0;
        int left=0;
        int index=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                count++;
            }
            while (count>k){
                if (arr[left]==0){
                    count--;
                }
                left++;
            }
            if (i-left+1>windowCount){
                windowCount=i-left+1;
                index=left;
            }
        }
        System.out.println("Size is:::"+windowCount+" index is:::"+index);
    }
    public static void replaceOneWithZero(int[]arr,int n){
        int count=0;
        int maxCount=0;
        int previousIndex=-1;
        int index=-1;
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                count++;
            }
            else {
                count=i-previousIndex;
                previousIndex=i;
            }
            if (maxCount<count){
                maxCount=count;
                index=previousIndex;
            }
        }

        System.out.println("Max Size is:::"+maxCount+" index was replaced:::"+index);
    }
    public static void main(String[] args) {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        int k = 2;
        int n=A.length;
        countZeros(A,n,k);

        int[] arr = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int j=arr.length;
        replaceOneWithZero(arr,j);
    }
}
