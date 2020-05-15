package com.practice.problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FindPairSum {
    public static void printPair(int[] arr,int sum){
        if(arr.length==1){
            if(arr[0]==sum){
                System.out.println("Index is:::"+arr[0]);
                return;
            }
            else
                return;
        }
        Arrays.sort(arr);
        int index;
        for(int i=0;i<arr.length;i++){
            int temp=sum-arr[i];
            index=findIndex(arr,temp,i+1,arr.length-1);
          //  System.out.println("Index is:::"+index);
            if(index>-1){
                System.out.println("Elements are::::"+arr[i]+" "+arr[index]);
            }
        }
    }
    public static int findIndex(int[] arr,int key,int start,int end){

        if(start<end ) {
            int mid = (end + start) / 2;
            if (key == arr[mid]) {
                return mid;
            }
           else if (arr[mid] > key) {
                return findIndex(arr, key, start, mid - 1);
            } else  {
                return findIndex(arr, key, mid + 1, end);
            }
        }
        else if(start==end){
            if (arr[start]==key){
                return start;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int []arr={8,7,2,5,3,1,5};
    int sum=10;
    printPair(arr,sum);
    }
}
