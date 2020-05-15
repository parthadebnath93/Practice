package com.practice.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubRecursion {
    static int max_Ref;
    public static int _lis(int[] arr,int n){
        if (n==1){
            return 1;
        }
        int res,max_ending_res=1;
        for (int i=1;i<n;i++){
            res=_lis(arr,i);
            if (arr[i-1]<arr[n-1] && res+1>max_ending_res){
                max_ending_res=res+1;
            }
        }
        if (max_Ref<max_ending_res){
            max_Ref=max_ending_res;
        }
        return max_ending_res;
    }
    public static int lis(int[] arr,int n){
        max_Ref=1;
            _lis(arr,n);
        return max_Ref;
    }
    public static int lis_dp(int[] arr,int n){
        int[] lis=new int[n];
        int max=0,maxIndex;
        for (int i=0;i<n;i++){
            lis[i]=1;
        }
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (max<lis[i]){
                max=lis[i];
            }
        }
        return max;
    }
    public static int find_Lis(int[] arr,int n){
        int[] lis=new int[n];
        for (int i=0;i<n;i++){
            lis[i]=1;
        }
       for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>i;j--){
                if (arr[j]>arr[i] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
       }
       int max=Integer.MIN_VALUE;
       for (int i=0;i<lis.length;i++){
           if (lis[i]>max){
               max=lis[i];
           }
       }
       int[] ele=new int[max];
       int k=max;
       int l=0;
        System.out.println(Arrays.toString(lis));
       for (int i=0;i<n;i++){
           if (k==lis[i]){
            ele[l++]=arr[i];
            k--;
           }
       }
        System.out.println(Arrays.toString(ele));
       return max;
    }
    public static void findLongestIncreasingSubsequent(int[] arr,int n){
        int[] lis=new int[n];
        for (int i=0;i<n;i++){
            lis[i]=1;
        }
        for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>i;j--){
                if (arr[i]<arr[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        System.out.println(Arrays.toString(lis));
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60,80};
        int n = arr.length;
        System.out.println(find_Lis(arr,n));
        findLongestIncreasingSubsequent(arr,n);
    }
}
