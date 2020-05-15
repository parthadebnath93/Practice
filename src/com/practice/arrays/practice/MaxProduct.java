package com.practice.arrays.practice;

public class MaxProduct {
    public static void product(int[] arr,int n){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }
            if (arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if (min2>arr[i]){
                min2=arr[i];
            }
        }
        if (min1*min2>max1*max2){
            System.out.println("Product is:::"+(min1*min2));
        }
        else {
            System.out.println("Product is:::"+(max1*max2));
        }
    }
    public static void main(String[] args) {
        int[] A = { -10, -3, 5, 6, -2 };
        int n=A.length;
        product(A,n);
    }
}
