package com.practice.arrays.practice;

import java.util.HashMap;
import java.util.Map;

public class FindMaxSubArrayOfEqual0and1 {
    public static void findMaxSubArray(int[] arr,int n){
        int maxLength=0;
        int endIndex=-1;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i]==0?-1:1;
            if (map.containsKey(sum) && i-map.get(sum)>maxLength){
                maxLength=i-map.get(sum);
                endIndex=i;
            }
            else
            map.put(sum,i);
        }
        System.out.println((endIndex-maxLength+1)+" "+maxLength);
    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 0, 1, 0, 0 };
        int n=arr.length;
        findMaxSubArray(arr,n);
    }
}
