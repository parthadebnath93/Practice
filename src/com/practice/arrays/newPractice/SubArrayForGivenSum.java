package com.practice.arrays.newPractice;

import java.util.HashMap;
import java.util.Map;

public class SubArrayForGivenSum {
    public static void printSubArray(int[] arr,int n,int S){
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int len=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
            if (map.containsKey(sum-S)){
                len=i-map.get(sum-S);
                System.out.println((i-len+1)+" "+i);
            }

        }
    }
    public static void main(String[] args) {
        int[] A = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int sum = 7;
        printSubArray(A,A.length,sum);
    }
}
