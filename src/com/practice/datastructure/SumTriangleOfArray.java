package com.practice.datastructure;

import java.util.Arrays;

public class SumTriangleOfArray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A,A.length);
    }
    public static void printTriangle(int []arr,int n){
        if(arr.length<1){
            return;
        }
        int []temp=new int [n-1];
        for (int i=0;i<n-1;i++){
            int t=arr[i]+arr[i+1];
            temp[i]=t;
        }
        printTriangle(temp,temp.length);
        System.out.println(Arrays.toString(arr));

    }
}
