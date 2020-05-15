package com.practice.arrays.newPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithGivenSum {
    public static void insert(Map<Integer, ArrayList<Integer>>map,int key,int val){
        if (!map.containsKey(key)){
            map.put(key,new ArrayList<Integer>());
        }
        map.get(key).add(val);
    }
    public static void printSubArrays(int[] arr,int n){
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        insert(map,0,-1);
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (map.containsKey(sum)){
                List<Integer>list=map.get(sum);
                for (Integer l:list){
                    System.out.print((l+1)+" ... "+i);
                }
            }
            insert(map,sum,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int sum = 7;
        int n=arr.length;
        printSubArrays(arr,n);
    }
}
