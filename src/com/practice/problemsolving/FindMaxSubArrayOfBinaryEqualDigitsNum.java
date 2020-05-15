package com.practice.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class FindMaxSubArrayOfBinaryEqualDigitsNum {
    public static void printMaxSubArray(int[] A, int n) {
        Map<Integer,Integer>map=new HashMap<>();
        int ending_index=-1;
        int len=0;
        map.put(0,-1);
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=(A[i]==0)?-1:1;
            if (map.containsKey(sum)){
                if (len<i-map.get(sum)){
                    len=i-map.get(sum);
                    ending_index=i;
                }
            }
            else {
                map.put(sum,i);
            }
        }
        System.out.println(ending_index-len+1+" "+ending_index);
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 0, 0};
        int n = arr.length;
        printMaxSubArray(arr, n);
    }
}
