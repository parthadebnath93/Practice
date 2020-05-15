package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class InLineMergeTwoAyyars {
    public static void merge(int[]a,int[]b){
        int high=a.length-1;
        for (int i=a.length-1;i>=0 && high>=a.length-b.length;i--){
            if (a[i]!=0){
                int temp=a[i];
                a[i]=a[high];
                a[high--]=temp;
            }
        }
       // System.out.println(high+" "+Arrays.toString(a));
        int i=0;
        int k=0;
        int j=high+1;
        while (i<b.length && j<a.length){
            if (b[i]<a[j]){
                a[k++]=b[i++];
            }
            else {
                a[k++]=a[j++];
            }
        }
        while (i<b.length){
            a[k++]=b[i++];
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a={0,2,0,3,0,5,6,0,0};
        int[] b={1,8,9,10,15};
        merge(a,b);
    }
}
