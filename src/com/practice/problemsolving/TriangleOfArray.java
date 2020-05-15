package com.practice.problemsolving;

import java.util.Arrays;

public class TriangleOfArray {
    public static void constructTriangle(int []arr){
        if(arr.length<1){
            return;
        }
        int []temp=new int [arr.length-1];
        for (int i=0;i<arr.length-1;i++){
            int sum=arr[i]+arr[i+1];
            temp[i]=sum;
        }
        constructTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        constructTriangle(A);
    }
}
