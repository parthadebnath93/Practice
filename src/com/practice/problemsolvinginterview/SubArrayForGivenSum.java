package com.practice.problemsolvinginterview;

import java.util.HashMap;
import java.util.Map;

public class SubArrayForGivenSum {
    public static void findMaximumSubArray(int[] arr,int n,int S){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int strat=-1;
        int end=-1;
        int maxLength=0;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
            if (map.containsKey(sum-S) && maxLength<i-map.get(sum-S)){
                end=i;
                maxLength=i-map.get(sum-S);
            }
        }
        strat=end-maxLength+1;
        System.out.println(strat+" "+end);
    }
    public static void main(String[] args) {
        int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
        int n=A.length;
        findMaximumSubArray(A,n,sum);
    }
}
