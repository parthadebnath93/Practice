package com.practice.arrays.practice;

import java.util.Arrays;

public class InLineMerge {
    public static void merge(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        for (int i=0;i<m;i++){
            if (a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
                int k=0;
                int first=b[0];
                for (k=1;k<n && b[k]<first;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=first;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        int[] a={1,4,7,8,10};
        int[] b={2,3,9};
        merge(a,b);
    }
}
