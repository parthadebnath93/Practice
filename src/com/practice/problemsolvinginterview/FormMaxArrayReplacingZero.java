package com.practice.problemsolvinginterview;

public class FormMaxArrayReplacingZero {
    public static void replaceZero(int[] arr,int n){
        int count=0;
        int maxLen=0;
        int ending_index=0;
        int maxIndex=-1;
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                count++;
            }
            else {
                count=i-ending_index;
                ending_index=i;
            }
            if (maxLen<count){
                maxLen=count;
                maxIndex=ending_index;
            }
        }
        System.out.println("Index is::::"+(maxIndex-maxLen+1)+" Max length:::"+(maxIndex-1));

    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int n=arr.length;
        replaceZero(arr,n);
    }
}
