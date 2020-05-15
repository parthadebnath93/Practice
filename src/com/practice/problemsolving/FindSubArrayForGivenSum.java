package com.practice.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubArrayForGivenSum {
    public static void printSubArray(int[] arr,int n,int sum){
        int length=0;
        int last=-1;
        for (int i=0;i<arr.length;i++){
            int newSum=0;
            for (int j=i;j<n;j++){
                newSum+=arr[j];
                if (newSum==sum){
                    if(length<j-i+1) {
                        length=j-i+1;
                        last = j;
                    }
                }
            }

        }
        System.out.println("Starting Index is:::::"+((last-length)+1)+" Last INdex is::::"+last);
    }
    public static void printMaxSubArray(int[] arr,int n,int S){
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int last=-1;
        int length=0;
        map.put(0,-1);
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-S) && length<i-map.get(sum-S)){
                length=i-map.get(sum-S);
                last=i;
            }

        }
        System.out.println((last-length+1)+" "+last);
    }
    public static void printMaximumSubArray(int[] arr,int n,int s){
        Map<Integer,Integer>map=new HashMap<>();
        int length=0;
        int last=-1;
        int sum=0;
        map.put(0,-1);
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-s) && length<i-map.get(sum-s)) {
                last=i;
                length=i-map.get(sum-s);
            }
        }
        System.out.println("Start Index::::"+(last-length+1)+" last is::::"+(last));
    }
    public static void main(String[] args) {
        int[] arr={5,6,-5,5,3,5,3,-2,0};
        int n=arr.length;
        int sum=8;
        printSubArray(arr,n,sum);
        printMaxSubArray(arr,n,sum);
        printMaximumSubArray(arr,n,sum);
    }
}
