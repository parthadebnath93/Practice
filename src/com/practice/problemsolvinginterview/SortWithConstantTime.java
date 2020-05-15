package com.practice.problemsolvinginterview;

public class SortWithConstantTime {
    public static void sortArray(int[] arr,int n){
        int high=n-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]==1){
                int temp=arr[high];
                arr[high]=arr[i];
                arr[i]=temp;
                high--;
            }
        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n=A.length;
        sortArray(A,n);
    }
}
