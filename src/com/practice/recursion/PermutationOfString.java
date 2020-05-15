package com.practice.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PermutationOfString {
    public static  void permute(String str, int left, int right, Set<String>set){
        if(left==right){
            set.add(str);
        }
        else {
            for (int i=left;i<=right;i++){
                str=swap(str,left,i);
                permute(str,left+1,right,set);
                str=swap(str,left,i);
            }
        }
    }
    public static  String swap(String str,int left,int right){
        char []arr=str.toCharArray();
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        String str="abcd";
        permute(str,0,str.length()-1,set);
        System.out.println("Size is:::"+set.size());

        System.out.println(set);
    }
}
