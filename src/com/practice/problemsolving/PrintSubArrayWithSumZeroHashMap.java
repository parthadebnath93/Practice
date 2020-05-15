package com.practice.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintSubArrayWithSumZeroHashMap {
    public static void insert(Map<Integer, ArrayList<Integer>>map,int key,int value){
        if (!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(value);
    }
    public static void printSubArrays(int[] arr){
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        if(arr.length==0){
            if(arr[0]==0){
                System.out.println("Index is::::"+0);
                return;
            }
            else {
                System.out.println("No SUch sub array");
                return;
            }
        }
        insert(map,0,-1);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
            if (map.containsKey(sum)){
                List<Integer>list=map.get(sum);
                for (Integer k:list){
                    System.out.println("Sub Array is:::"+ (k+1)+" to "+i);
                }
            }
            insert(map,sum,i);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,4,-7,3,1,3,-4,-2,-2};
        printSubArrays(arr);
    }
}
