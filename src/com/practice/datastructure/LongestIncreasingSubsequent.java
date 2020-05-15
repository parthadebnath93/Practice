package com.practice.datastructure;

public class LongestIncreasingSubsequent {
    static int max_ref;
    public static  int _lis(int []arr,int n){
        if(n==1){
            return 1;
        }
        int res,max_result=1;
        for(int i=1;i<n;i++){
            res=_lis(arr,i);
            if(arr[i-1]<arr[n-1] && res+1>max_result) {
                max_result = res + 1;
            }
        }
        if(max_ref<max_result){
            max_ref=max_result;
        }
        return max_result;
    }
    public static int lis(int []arr,int n){
        max_ref=1;
    _lis(arr,n);
    return max_ref;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Result::::"+lis(arr,n));
    }
}
