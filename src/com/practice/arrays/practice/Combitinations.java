package com.practice.arrays.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Combitinations {
    public static String swap(String str,int i,int j){
        char[] arr=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
    public static void combination(String str, Set<String>set,int l,int r){
        if (l==r){
            set.add(str);
        }
        for (int i=l;i<=r;i++){
            str=swap(str,l,i);
            combination(str,set,l+1,r);
            str=swap(str,l,i);
        }
    }
    public static void main(String[] args) {
        String str="101";
        Set<String>set=new HashSet<>();
        combination(str,set,0,str.length()-1);
        System.out.println(set);
    }
}
