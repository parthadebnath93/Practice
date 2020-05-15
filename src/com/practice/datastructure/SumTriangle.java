package com.practice.datastructure;

import java.util.Arrays;

public class SumTriangle {
    public static void printArrayTriAngle(int[] arr,int n){
        if (n<1){
            return;
        }
        int[] temp=new int[n-1];
        for (int i=0;i<n-1;i++){
            temp[i]=arr[i]+arr[i+1];
        }
        printArrayTriAngle(temp,temp.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        printArrayTriAngle(ar,ar.length);
    }
}
