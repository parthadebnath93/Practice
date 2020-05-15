package com.practice.problemsolvinginterview;

public class RotateMatrix {
    public static void rotate(int[][] arr,int n){
        for (int i=0;i<n/2;i++){
            for (int j=0;j<n;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[n-1-i][j];
               arr[n-1-i][j]=temp;
            }
        }
    }
    public static void swap(int[][] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<=j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
    }
    public static void printArray(int[][]arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printTheArray(int[][]arr,int n){
        for (int i=0;i<n;i++){
            for (int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void leftRotate(int[][] arr,int n){
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void printOriginalArray(int[][] arr,int n){
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
        System.out.println("Original Array is::::");
        printOriginalArray(arr,n);
        System.out.println("Left Rotate::::");
        leftRotate(arr,n);
        System.out.println("Right Rotate is:::");
        printTheArray(arr,n);
        rotate(arr,n);
        System.out.println("After calling Rotating::::");
        printArray(arr,n);
        swap(arr,n);
        System.out.println("After Rotate::::");
        printArray(arr,n);
    }
}
