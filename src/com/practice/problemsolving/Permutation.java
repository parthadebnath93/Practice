package com.practice.problemsolving;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String str="abc";
        Permutation pr=new Permutation();
        //pr.permute(str,0,str.length()-1,set);
        permutetations(str,0,str.length()-1,set);
        System.out.println(set);
    }
    public void permute(String str,int l,int r,HashSet<String>set)
    {
       if (l==r){
           set.add(str);
       }
       else {
           for (int i=l;i<=r;i++){
               str=swap(str,l,i);
               permute(str,l+1,r,set);
               str=swap(str,l,i);
           }
       }
    }
    public static void permutetations(String str, int l, int r, Set<String>set){
        if (l==r){
            set.add(str);
        }
        for (int i=l;i<=r;i++){
            str=swapElements(str,l,i);
            permutetations(str,l+1,r,set);
            str=swapElements(str,l,i);
        }
    }
    public static String swapElements(String str,int l,int r){
        char []arr=str.toCharArray();
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return String.valueOf(arr);
    }
    public String swap(String str,int l,int r){
        char temp;
        char []arr=str.toCharArray();
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return String.valueOf(arr);
    }
}
