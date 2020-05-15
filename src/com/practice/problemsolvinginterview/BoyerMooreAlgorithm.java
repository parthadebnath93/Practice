package com.practice.problemsolvinginterview;

import java.util.HashMap;
import java.util.Map;

public class BoyerMooreAlgorithm {
    public static void boyerMooreAlgorith(int[] arr,int n){
        int element=arr[0];
        int count=0;
        for (int i=1;i<n;i++){
            if(arr[i]==element){
                count++;
            }
            else {
                count--;
                if (count==0){
                    element=arr[i];
                    count++;
                }
            }
        }
        System.out.println("Element is:::"+element);
    }
    public static void getElement(int[] arr){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i:arr
             ) {
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        for (Map.Entry entry:map.entrySet()){
            if ((Integer)entry.getValue()>arr.length/2){
                System.out.println("Value is::::"+entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,8,7,2,2,5,2,3,1,2,2};
        int n=arr.length;
        boyerMooreAlgorith(arr,n);
        getElement(arr);
    }
}
