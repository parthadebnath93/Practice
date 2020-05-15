package com.practice.problemsolving;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        int[] arr={6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int high=arr.length-1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
