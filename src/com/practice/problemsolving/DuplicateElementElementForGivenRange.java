package com.practice.problemsolving;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementElementForGivenRange {
    public static void getDuplicateElement(int[] arr,int n){
        Set<Integer>set=new HashSet<>();
        int index;
        for (index=0;index<n;index++){
            if(!set.add(arr[index])){
                System.out.println("Duplicate Element is::::"+arr[index]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int n=arr.length;
        getDuplicateElement(arr,n);
    }
}
