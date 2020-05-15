package com.practice.problemsolvinginterview;

import java.util.Stack;

public class MaximumOfEachSlidingWindow {
    public static void addMaximumElements(int[] arr, int start, int end, Stack<Integer>stack){
       // System.out.println(arr[start]+" "+arr[end]);
        int maxElement=Integer.MIN_VALUE;
        for (int i=start;i<=end;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        stack.add(maxElement);
    }
    public static void getAllMaxElements(int[] arr,int n,int k){
        Stack<Integer> stack=new Stack<>();
        addMaximumElements(arr,0,k-1,stack);
        for (int i=k;i<n;i++){
            addMaximumElements(arr,i-k+1,i,stack);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={9, 7, 2, 4, 6, 8, 2, 1, 5};
        int n=arr.length;int k=3;
        getAllMaxElements(arr,n,k);
    }
}
