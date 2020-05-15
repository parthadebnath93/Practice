package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryArrayOfEqualOneZero {
    public static void printSubArray(int[] arr,int n){
        int len=0;
        int endIndex=-1;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
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
        System.out.println("Start::::"+(endIndex-len+1)+" end Index:::"+endIndex);
    }
    public static void insert(Map<Integer, List<Integer>>map, int sum, int index){
        if (!map.containsKey(sum)){
            map.put(sum,new ArrayList<>());
        }
        map.get(sum).add(index);
    }
    public static void getSubArrayOfSumZero(int[] arr,int n){
      Map<Integer,List<Integer>>map=new HashMap<>();
      int maxLen=0;
      int endIndex=-1;
      int sum=0;
      insert(map,0,-1);
      for (int i=0;i<n;i++){
          sum+=arr[i];
          if (map.containsKey(sum)){
              List<Integer> list = map.get(sum);

              // find all sub-arrays with same sum
              for (Integer value: list) {
                  System.out.println("Subarray [" + (value + 1) + ".." +
                          i + "]");
              }
          }
          insert(map,sum,i);
      }
    }
    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 0, 0 };
        int n=A.length;
        printSubArray(A,n);

        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int length=arr.length;
        getSubArrayOfSumZero(arr,length);
    }
}
