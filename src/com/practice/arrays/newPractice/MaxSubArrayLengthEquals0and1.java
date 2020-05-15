package com.practice.arrays.newPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayLengthEquals0and1 {
    public static void maxSubArray(int[] arr,int n){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        int endIndex=-1;
        int sum=0;
        for (int i=0;i<n;i++){
           sum+=arr[i]==0?-1:1;
           if (map.containsKey(sum)){
                if (len<i-map.get(sum)){
                    len=i-map.get(sum);
                    endIndex=i;
                }
           }
           else {
               map.put(sum,i);
           }
        }
        if (endIndex!=-1){
            System.out.println(endIndex-len+1+" to "+endIndex);
        }
    }
    public static void main(String[] args) {
        int[] arr= { 0, 0, 1, 0, 1, 0, 0 };
        int n=arr.length;
        maxSubArray(arr,n);
    }
}
