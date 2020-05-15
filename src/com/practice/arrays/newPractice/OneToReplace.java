package com.practice.arrays.newPractice;

public class OneToReplace {
    public static void replace(int []arr,int n,int k){
        int left=0;
        int count=0;
        int leftIndex=-1;
        int window=0;
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
            if (i-left+1>window)
            {
                window=i-left+1;
                leftIndex=left;
            }
        }
        System.out.println(window);
        System.out.println("Start "+(leftIndex)+" End is::::"+(leftIndex+window-1));

    }
    public static void main(String[] args) {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        int k = 2;
        replace(A,A.length,k);
    }
}
