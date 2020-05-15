package com.practice.problemsolving;

public class SortBinaryArray {
    public static void sortArray(int[] arr,int n){
        if(arr.length>1){
            int left=0;
            int right=n-1;
            while (left<right){
                if (arr[left]==0){
                    left++;
                }
                 if(arr[right]==1){
                    right--;
                }
                 if (arr[left]==1){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    right--;
                }
            }
        }
    }
    public static void printArray(int[] arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,0,0,1,0,1,0,1,1,0};
        int n=arr.length;
        //sortArray(arr,n);
        sortBinaryArray(arr,n);
        printArray(arr,n);
    }
    public static void sortBinaryArray(int[] arr,int n){
        int countZero=0;
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        System.out.println("Count is:::"+countZero);
        for (int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for (int i=countZero;i<arr.length;i++){
            arr[i]=1;
        }

    }
}
