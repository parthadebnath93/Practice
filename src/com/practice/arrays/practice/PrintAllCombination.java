package com.practice.arrays.practice;

public class PrintAllCombination {
    public static void printAllCombinations(int[] arr,String out,int i,int n,int k){
        if (k>n){
            System.out.println("Invalid Input");
            return;
        }
        if (k==0){
            System.out.println(out);
            return;
        }
        for (int j=i;j<n;j++){
            printAllCombinations(arr,out+" "+arr[j],j+1,n,k-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        printAllCombinations(arr,"",0,arr.length,k);
    }
}
