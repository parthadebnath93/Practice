package com.practice.problemsolving;

public class FindRotationPoint {
    public static int findRotationPoint(int []arr,int n){
        int min_index=-1;
        if(arr.length>0){
            int min=arr[0];
            for (int i=0;i<n;i++){
                if(min>arr[i]){
                    min=arr[i];
                    min_index=i;
                }
            }
        }
        return min_index;
    }
    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        int n = arr.length;
        System.out.println("Min Point is:::"+arr[findRotationPoint(arr,n)]);
    }
}
