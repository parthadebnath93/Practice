package com.practice.problemsolvinginterview;

public class MaximumProductOfTwoArrayElements {
    public static void findMaxProduct(int[] arr,int n){
        int max1=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
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
                max2=min1;
                min1=arr[i];
            }
            else if (arr[i]<min2){
                min2=arr[i];
            }
        }
        if (max1*max2>min1*min2){
            System.out.println("Maximum Product is:::"+(max1*max2)+" Values are:::"+max1+" "+max2);
        }
        else {
            System.out.println("Maximum Product is:::"+(min1*min2)+" Values are::::"+min1+" "+min2);
        }
    }
    public static void main(String[] args) {
        int arr[] = { -10, -3, 5, 6, -2 };
        int n=arr.length;
        findMaxProduct(arr,n);
    }
}
