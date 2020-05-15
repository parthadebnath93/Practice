package com.practice.problemsolvinginterview;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
    public static String swap(String str,int l,int r){
        char[] arr=str.toCharArray();
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return String.valueOf(arr);
    }
    public static void permute(String str, Set<String>set,int l,int r){
        if (l==r){
            set.add(str);
        }
        for (int i=l;i<=r;i++){
            str=swap(str,l,i);
            permute(str,set,l+1,r);
            str=swap(str,l,i);
        }
    }

    public static void main(String[] args) {
        String str="1011";
        Set<String>set=new HashSet<>();
        permute(str,set,0,str.length()-1);
        System.out.println(set);
    }
}
