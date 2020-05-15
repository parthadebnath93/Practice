package com.practice.arrays.newPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintAllCombination {
    public static String replace(String str,int l,int r){
        char[] arr=str.toCharArray();
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return String.valueOf(arr);
    }
    public static void printAllCombination(String str, int l, int r, Set<String> set){
        if (l==r){
            set.add(str);
        }
        else {
            for (int i = 0; i <= r; i++) {
                str = replace(str, l, i);
                printAllCombination(str, l + 1, r, set);
                str = replace(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str="101";
        Set<String>set=new HashSet<>();
        printAllCombination(str,0,str.length()-1,set);
        System.out.println(set);
    }
}
