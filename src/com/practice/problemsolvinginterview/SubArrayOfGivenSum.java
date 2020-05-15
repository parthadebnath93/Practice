package com.practice.problemsolvinginterview;

import java.util.HashMap;
import java.util.Map;

public class SubArrayOfGivenSum {
    public static void getSubArrays(int[] arr,int n,int S){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int endIndex=-1;
        int sum=0;
        int maxLength=0;
        for (int i=0;i<n;i++){
            sum +=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if (map.containsKey(sum-S) && maxLength<i-map.get(sum-S)){
                endIndex=i;
                maxLength=i-map.get(sum-S);
            }
        }
        System.out.println("indexes are:::"+(endIndex-maxLength+1)+" "+endIndex);
    }

    public static void main(String[] args) {
        int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
        getSubArrays(A,A.length,sum);
    }
}
