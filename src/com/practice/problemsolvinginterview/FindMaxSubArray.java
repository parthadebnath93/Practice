package com.practice.problemsolvinginterview;

import com.sun.source.tree.IfTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMaxSubArray {
    public static boolean isConsecutive(int[] arr,int max,int min,int i,int j){
        boolean[] isVisited=new boolean[j-i+1];
        if (max-min!=j-i){
            return false;
        }
        for (int k=i;k<=j;k++){
            if (isVisited[arr[k]-min]){
                return false;
            }
            isVisited[arr[k]-min]=true;
        }
        return true;
    }
    public static void findMaxSubArray(int[] arr,int n){
        //int min_value,max_value;
        int length=1;
        int start=-1,end=-1;
        for (int i=0;i<n;i++){
           int min_value=arr[i];
            int max_value=arr[i];
            for (int j=i+1;j<n;j++){
                min_value=Integer.min(min_value,arr[j]);
                max_value=Integer.max(max_value,arr[j]);
                if (isConsecutive(arr,max_value,min_value,i,j)){
                    if (length<max_value-min_value+1){
                        length=max_value-min_value+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        System.out.println("Start::::"+start+" end:::"+end);
    }
    public static void findMaxSubArrayHashMap(int[]arr,int n){
        Map<Integer,Integer>map=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        int start=-1;
        int end=-1;
        int maxLength=0;
        for (int i=0;i<n;i++){
            if (!set.add(arr[i])){
                set.clear();
                if (maxLength<(end-start)+1){
                    maxLength=(end-start)+1;
                    start=i;
                    map.put(maxLength,end);
                    set.add(arr[i]);
                }
            }
            else {
                if (set.size()==1){
                    start=i;end=i;
                }
                else {
                    end=i;
                }
            }
        }
         start=map.get(maxLength)-maxLength;
        end=map.get(maxLength);
        System.out.println("Start :::"+start+" end:::"+end);
    }
    public static void main(String[] args) {
        int[] A = { 2, 0, 2, 1, 4, 3, 1, 0 };
        int n=A.length;
        findMaxSubArray(A,n);
        findMaxSubArrayHashMap(A,n);
    }
}
