package com.practice.problemsolving;

public class RotateMatrix {
    public static void swap(int [][]arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i<=j){
                   int temp= arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=temp;
                }
            }
        }
    }
    public static void rotate(int [][]arr,int n){
        int temp=0;
        for(int i=0;i<n/2;i++){
            for (int j=0;j<n;j++){
                temp=arr[i][j];
               arr[i][j]= arr[n-1-i][j];
               arr[n-1-i][j]=temp;
            }
        }
    }
    public static void printArray(int [][]arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        rotate(arr,n);
        swap(arr,n);
        printArray(arr,n);
    }

}
