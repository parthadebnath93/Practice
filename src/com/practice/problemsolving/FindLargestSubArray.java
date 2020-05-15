package com.practice.problemsolving;

import java.util.*;

public class FindLargestSubArray {
    public static void findArray(int[] arr,int n){
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer>map=new HashMap<>();
        int start=-1;
        int last=-1;
        int maxIndexCount=0;
        for (int i=0;i<n;i++){
            if(!set.add(arr[i])){
                set.clear();
                if(maxIndexCount<(last - start)+1) {
                   // set.remove(arr[i]);
                    maxIndexCount = (last - start)+1;
                    map.put(maxIndexCount,last);
                    set.add(arr[i]);
                    start=i;
                }


            }
            else {
                if(set.size()==1 ){
                    start=i;
                    last=i;
                }
                else {
                    last=i;
                }
            }
        }
        start=map.get(maxIndexCount)-maxIndexCount;
        last=map.get(maxIndexCount);
        System.out.println("Indexs are::::"+start+" Last is::::"+last);
    }
    public static void main(String[] args) {
        int[] A = { 2, 0, 2, 1, 4, 3, 1, 0 };
        findArray(A,A.length);
    }
}
