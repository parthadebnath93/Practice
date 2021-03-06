package com.practice.arrays.newPractice;

import java.util.Arrays;

public class ReplaceArrayElementWithProduct {
    public static int replace(int[] arr,int leftProduct,int index){
        if (index==arr.length-1){
            int temp=arr[index];
            arr[index]=leftProduct;
            return temp;
        }
        int rightProduct=replace(arr,leftProduct*arr[index],index+1);
        int temp=arr[index];
        arr[index]=rightProduct*leftProduct;
        return temp*rightProduct;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        replace(arr,1,0);
        System.out.println(Arrays.toString(arr));
    }
}
