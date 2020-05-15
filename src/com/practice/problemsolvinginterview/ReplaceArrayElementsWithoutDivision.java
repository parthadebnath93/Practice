package com.practice.problemsolvinginterview;

import java.util.Arrays;

public class ReplaceArrayElementsWithoutDivision {
    public static int replace(int[] arr,int leftProduct,int index){
        if (arr.length-1==index){
           int temp=arr[index];
           arr[index]=leftProduct;
           return temp;
        }
        int rightProduct=replace(arr,arr[index]*leftProduct,index+1);
        int temp=arr[index];
        arr[index]=leftProduct*rightProduct;
        return temp*rightProduct;
    }
    public static int replaceElements(int[] arr,int leftProduct,int index){
        if (index==arr.length-1){
            int temp=arr[index];
            arr[index]=leftProduct;
            return temp;
        }

            int rightProduct=replaceElements(arr,leftProduct*arr[index],index+1);
            int temp=arr[index];
            arr[index]=leftProduct*rightProduct;
            return temp*rightProduct;

    }
    public static void findProducts(int[] arr){
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        left[0]=1;
        for (int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[arr.length-1]=1;
        for (int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        replace(arr,1,0);
        System.out.println(Arrays.toString(arr));
        int[] a={1,2,3,4,5};
        replaceElements(a,1,0);
        System.out.println(Arrays.toString(a));
        int[] b={1,2,3,4,5};
        findProducts(b);
    }
}
