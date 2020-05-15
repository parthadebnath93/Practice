package com.practice.problemsolving;

import java.util.Arrays;

public class InPlaceMergeTwoArrays {
    public static void inPlaceMerge(int[] a,int[] b){
        int[] merge=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                merge[k++]=a[i++];
            }
            else if(a[i]>b[j]){
                merge[k++]=b[j++];
            }
            else {
                merge[k++]=a[i++];
                merge[k++]=b[j++];
            }
        }
        while (i<a.length){
            merge[k++]=a[i++];
        }
        while (j<b.length){
            merge[k++]=b[j++];
        }
        k=0;
        for (i=0;i<a.length;i++){
            a[i]=merge[k++];
        }
        for (j=0;j<b.length;j++){
            b[j]=merge[k++];
        }
    }
    public static void main(String[] args) {
        int[] a={1,4,7,8,10};
        int[] b={2,3,9};
        inPlaceMerge(a,b);
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:b){
            System.out.print(i+" ");
        }
    }
}
