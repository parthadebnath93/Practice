package com.practice.dynamicProgramming;

public class MaximumProductSubArray {
    public static void maxProduct(int[] arr,int n){
        int maxLength=0,maxProduct=1,endIndex=-1,localPro=1;
        for (int i=0;i<n;i++){
            localPro=1;
            for (int j=i;j<n;j++){
                localPro *=arr[j];
                if (localPro>maxProduct){
                    endIndex=j;
                    maxLength=j-i;
                    maxProduct=localPro;
                }
            }
        }
        System.out.println(maxProduct+" end index:::"+endIndex);
    }
    public static void maxProductOptimized(int[] arr){
        int maxEnding=0;
        int minEnding=0;
        int max_so_far=0;
        for (int i:arr){
            int temp=maxEnding;
            maxEnding=Integer.max(i,Integer.max(i*maxEnding,i*minEnding));
            minEnding=Integer.min(i,Integer.min(i*temp,i*minEnding));
            max_so_far=Integer.max(max_so_far,maxEnding);
        }
        System.out.println(max_so_far);
    }
    public static void main(String[] args) {
        int[] A = { -6, 4, -5, 8, -10, 0, 8 };
        int n=A.length;
        maxProduct(A,n);
        maxProductOptimized(A);
    }
}
