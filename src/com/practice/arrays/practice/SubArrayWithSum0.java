package com.practice.arrays.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithSum0 {
    public static void insert(Map<Integer, List<Integer>>map, int key, int val){
        if (!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(val);
    }
    public static void findSubArrayOfSum0(int[] arr,int n){
        Map<Integer,List<Integer>>map=new HashMap<>();
        insert(map,0,-1);
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (map.containsKey(sum)){
                List<Integer>list=map.get(sum);
                for (Integer l:list){
                    System.out.print((l+1)+" to "+i+" ");
                }
            }
            insert(map,sum,i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int n=A.length;
        findSubArrayOfSum0(A,n);
    }
}
