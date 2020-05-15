package com.practice.arrays.practice;

import java.util.HashMap;
import java.util.Map;

public class MaxSUbArrayOfGivenSum {
    public static void findMaxSubArray(int[] arr,int n,int S){
        int maxLength=0;
        int endIndex=-1;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (map.containsKey(sum-S) && i-map.get(sum-S)>maxLength){
                maxLength=i-map.get(sum-S);
                endIndex=i;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println((endIndex-maxLength+1)+" to "+endIndex);
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
        int n=arr.length;
        findMaxSubArray(arr,n,sum);
    }
}
