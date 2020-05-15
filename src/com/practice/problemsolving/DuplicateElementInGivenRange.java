package com.practice.problemsolving;

public class DuplicateElementInGivenRange {
    public static void getDuplicateElement(int[] arr,int n){
       int sum=n*(n-1)/2;
        int arrSum=0;
        for (int i=0;i<n;i++){
            arrSum=getSumResult(arrSum,arr[i]);
        }
        System.out.println(arrSum-sum);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int n=arr.length;
        printDuplicateElement(arr,n);
    }
    public static void printDuplicateElement(int[] arr,int n){
//        int xorData=0;
//        for (int i=1;i<n;i++){
//            xorData =xorData^i;
//        }
        int arrXor=arr[0];
        for (int i=1;i<n;i++){
            arrXor = arrXor^arr[i]^i;
        }
        System.out.println(arrXor);
    }
    public static int getSumResult(int a,int b){
        while (b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}
