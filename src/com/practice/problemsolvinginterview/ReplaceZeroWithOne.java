package com.practice.problemsolvinginterview;

public class ReplaceZeroWithOne {
    public static void getIndexOfZero(int[] arr,int n){
        int maxCount=0;
        int maxIndex=-1;
        int count=0;
        int previousIndex=-1;
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
                maxIndex=previousIndex;
            }
        }
        System.out.println("Index is:::"+maxIndex+" count:::"+maxCount);
    }
    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int n=A.length;
        getIndexOfZero(A,n);
    }
}
