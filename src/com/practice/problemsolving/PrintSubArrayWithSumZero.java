package com.practice.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintSubArrayWithSumZero {
    public static void printSubArrays(int[] arr){
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    System.out.println("Sub array range is::::"+i+" to "+j);
                }
            }
        }
    }
    public static void getSubArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if (sum==0){
                    System.out.println("Found From Index "+i+" to "+j);
                }
            }
        }
    }
    public static void getSubArrayWithMap(int[] arr){
        Map<Integer, ArrayList<Integer>> map=new HashMap<>();
        insert(map,0,-1);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (map.containsKey(sum)){
                ArrayList<Integer>list=map.get(sum);
                for (int k:list
                     ) {
                    System.out.println("From ::::"+(k+1)+" to "+i);
                }
            }
            insert(map,sum,i);
        }
    }
    public static void insert(Map<Integer,ArrayList<Integer>>map,int key,int value){
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        else {
            map.get(key).add(value);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,4,-7,3,1,3,-4,-2,-2};
        printSubArrays(arr);
        getSubArray(arr);
        getSubArrayWithMap(arr);
    }
}
