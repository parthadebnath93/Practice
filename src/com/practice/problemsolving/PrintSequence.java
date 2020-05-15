package com.practice.problemsolving;

public class PrintSequence {
    public static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();;
    }
    public static void printSequenceUtil(int n,int k,int len,int []arr){
        if(len==k){
            printArray(arr);
            return;
        }
        int i=(len==0)?1:arr[len-1]+1;
        len++;
        while (i<=n){
            arr[len-1]=i;
            printSequenceUtil(n,k,len,arr);
            i++;
        }
        len--;
    }
    public static void printSequenceTest(int n,int k){
        int []arr=new int[k];
        int len=0;
        printSequenceUtil(n,k,len,arr);
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        printSequenceTest(n,k);
    }
}
