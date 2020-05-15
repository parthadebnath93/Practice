package com.practice.problemsolving;

public class FindIndexOfZeroToReplace {
    public static void findIndex(int[] arr,int n){
       int maxCount=0;
       int maxIndex=-1;
       int previous=-1;
       int count=0;
       for (int i=0;i<n;i++){
           if (arr[i]==1){
               count++;
           }
           else {
               count=i-previous;
               previous=i;
           }
           if (count>maxCount){
               maxCount=count;
               maxIndex=previous;
           }
        }
        System.out.println("Length is:::"+maxCount+" Index is:::"+maxIndex);
    }
    public static int getMaxCount(int[] arr,int n){
        int maxCount=0;
        for (int i=0;i<n;i++){
            if(arr[i]==1 && arr[i+1]==1 && maxCount<maxCount+1){
                maxCount++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,1,1,0,1,1};
        int length=arr.length;
        findIndex(arr,length);
    }
}
