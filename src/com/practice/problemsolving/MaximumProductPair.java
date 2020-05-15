package com.practice.problemsolving;

public class MaximumProductPair {
    public static void printMaxProductPair(int[] arr){
        int product=Integer.MIN_VALUE;
        int min=-1;
        int max=-1;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]*arr[j]>product){
                    product=arr[i]*arr[j];
                    min=i;
                    max=j;
                }
            }
        }
        System.out.println("Maximum produc is::::"+product+" values are:::"+arr[min]+" "+arr[max]);
    }
    public static void printProductsPair(int[] arr){
        int minimum=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<minimum){
                minimum=arr[i];
            }

        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>secMax && arr[i] !=max){
                secMax=arr[i];
            }
            if (arr[i]<secMin && arr[i]!=minimum){
                secMin=arr[i];
            }
        }
        //System.out.println(max+" "+secMax);
        if (max*secMax<=minimum*secMin){
            System.out.println("Product is::::"+max*secMax+" "+minimum*secMin);
        }
    }
    public static void printProductPairs(int[] arr){
        int max1=Integer.MIN_VALUE;
        int ma2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if (arr[i]<min2){
                min2=arr[i];
            }
            if (arr[i]>max1){
                ma2=max1;
                max1=arr[i];
            }
            else if(arr[i]>ma2){
                ma2=arr[i];
            }
        }
        System.out.println("First Product:::"+ma2*max1+" second  product:::"+min1*min2);
    }
    public static void main(String[] args) {
        int[] arr={-10,-3,5,6,-1};
        printMaxProductPair(arr);
        printProductsPair(arr);
        printProductPairs(arr);
    }
}
