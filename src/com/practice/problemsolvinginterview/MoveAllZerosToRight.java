package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        int[] a={0,1,2,3,0,0,5,6,0,7,8,0,9};
        int high=a.length-1;
        for (int i=a.length-1;i>=0;i--){
            if (a[i]==0){
                int temp=a[i];
                a[i]=a[high];
                a[high--]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
