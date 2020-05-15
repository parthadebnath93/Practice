package com.practice.arrays.newPractice;

public class FindIndexOfZeroTobeReplaced {
    public static void indexToReplace(int[] arr,int n){
        int count=0;
        int maxLength=0;
        int maxIndex=-1;
        int previousIndex=-1;
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                count++;
            }
            else {
                count=i-previousIndex;
                previousIndex=i;
            }
            if (count>maxLength){
                maxLength=count;
                maxIndex=previousIndex;
            }
        }
        System.out.println("Index is:::"+maxIndex);
    }
    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int n=A.length;
        indexToReplace(A,n);
    }
}
