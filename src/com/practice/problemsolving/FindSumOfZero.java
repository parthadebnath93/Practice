package com.practice.problemsolving;

import java.util.HashSet;
import java.util.Set;

public class FindSumOfZero {
    public static boolean isSumZero(int[] arr){
        if(arr.length==0){
            return false;
        }
        if (arr.length==1){
            if (arr[0]==0){
                return true;
            }
        }
        Set<Integer> set=new HashSet<>();
        int sum=0;
        set.add(arr[0]);
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = { 4, -6, 3, -1, 4, 2, 7 };
        if (isSumZero(A)){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
