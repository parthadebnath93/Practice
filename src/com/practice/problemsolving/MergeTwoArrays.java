package com.practice.problemsolving;

import java.util.Arrays;

public class MergeTwoArrays {
    public static int[] merge(int[] a,int[] b){
        int[] merge=new int[a.length];
        int i=0;int j=0;int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(a[i]==0){
                    i++;
                    continue;
                }
                merge[k++]=a[i++];
            }
            else if(a[i]>b[j]){
                if (a[i]==0){
                    i++;
                    continue;
                }
                merge[k++]=b[j++];
            }
        }
        while (i<a.length){
            merge[k++]=a[i++];
        }
        while (j<b.length){
            merge[k++]=b[j++];
        }
        return merge;
    }
    public static void mergeArrays(int[] a,int[] b){
        int high=a.length-1;
        for (int i=a.length-1;i>=0 && high>=a.length-b.length;i--){
           if (a[i]!=0){
               int temp=a[i];
               a[i]=a[high];
               a[high]=temp;
               high--;
           }
        }
        System.out.println("High::"+high+" "+ Arrays.toString(a));
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
        printArray(a);
    }

    public static void printArray(int[] arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={0,2,0,3,0,5,6,0,0};
        int[] b={1,8,9,10,15};
       // int[] merge=merge(a,b);
       // printArray(merge);
        mergeArrays(a,b);
    }
}
