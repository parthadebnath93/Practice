package com.practice.tree;

import java.util.Arrays;

public class LongestDecreasingSubSequent {
    public static void lds(int[] arr,int n){
        int[] lds=new int[n];
        lds[0]=1;
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[i] && lds[i]<lds[j]){
                    lds[i]=lds[j];
                }
            }
            lds[i]++;
        }
        System.out.println(Arrays.toString(lds));
    }
    public static void main(String[] args) {
        int[] A = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        int n=A.length;
        lds(A,n);
    }
}
