package com.practice.problemsolving;

import java.util.Arrays;

public class FindPairOfGivenSum {
    public static void printPairs(int[] arr,int sum){
        if(arr.length==1){
           if(arr[0]==sum){
               System.out.println("Element is:::"+arr[0]);
               return;
           }
           else {
               System.out.println("No Such Elements are found");
               return;
           }
        }
        else{
            Arrays.sort(arr);
            int low=0;
            int high=arr.length-1;
            for (int i=0;i<arr.length;i++){
                if(low<high && arr[low]+arr[high]>sum ){
                    high--;
                }
                else if(low<high && arr[low]+arr[high]<sum){
                    low++;
                }else if(low<high && arr[low]+arr[high]==sum) {

                    System.out.println("Pairs are:::"+arr[low]+" "+arr[high]);
                    low++;
                    high--;
                }

            }
        }
    }
    public static void main(String[] args) {
        int []arr={8,7,2,5,3,1,5};
        int sum=10;
        printPairs(arr,sum);
    }
}
