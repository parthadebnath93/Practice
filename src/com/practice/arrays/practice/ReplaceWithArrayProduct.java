package com.practice.arrays.practice;

import java.util.Arrays;

public class ReplaceWithArrayProduct {
    public static int replace(int[] arr,int index,int leftProduct){
        if (index==arr.length-1){
            int temp=arr[index];
            arr[index]=leftProduct;
            return temp;
        }
        int rightProduct=replace(arr,index+1,arr[index]*leftProduct);
        int temp=arr[index];
        arr[index]=leftProduct*rightProduct;
        return temp*rightProduct;
    }
    public static void getProductArray(int[] arr,int n){
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i];
        }
        for (int i=n-2;i>=0;i--){
            right[i]=arr[i+1]*right[i+1];
        }
        for (int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        replace(arr,0,1);
        System.out.println(Arrays.toString(arr));
        int[] A={1,2,3,4,5};
        getProductArray(A,A.length);
    }
}
