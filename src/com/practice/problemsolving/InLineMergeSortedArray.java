package com.practice.problemsolving;

public class InLineMergeSortedArray {
    public static void merge(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        for (int i=0;i<m;i++){
            if(a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
                int k;
                int first=b[0];
                for (k=1;k<n && b[k]<first;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=first;
            }

        }
    }
    public static void printArray(int[] arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,4,7,8,10};
        int[] b={2,3,9};
        merge(a,b);
        printArray(a);
        System.out.println();
        printArray(b);
    }
}
