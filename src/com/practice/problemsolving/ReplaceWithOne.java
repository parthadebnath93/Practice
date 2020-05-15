package com.practice.problemsolving;

public class ReplaceWithOne {
    public static void printIndex(int[] arr){
        int maxLength=0;
        int maxIndex=-1;
        int count=0;
        int previousIndex=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else {
                count=i-previousIndex;
                previousIndex=i;
            }
            if(count>maxLength){
                maxLength=count;
                maxIndex=previousIndex;
            }

        }
        System.out.println("Index is:::"+maxIndex+" Length is:::"+maxLength);
    }
    public static void main(String[] args) {
        int[] arr={ 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        printIndex(arr);
    }
}
