package com.practice.arrays.newPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayOfGivenSum {
    public static void printSubArray(int[] arr,int n,int S){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int len=0;
        int endIndex=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
            if (map.containsKey(sum-S) && len<i-map.get(sum-S)){
                len=i-map.get(sum-S);
                endIndex=i;
            }
        }
        System.out.println((endIndex-len+1)+" "+endIndex);
    }
    public static void main(String[] args) {
        int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
        printSubArray(A,A.length,sum);
    }
}
