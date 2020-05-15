package com.practice.problemsolvinginterview;

import java.util.stream.IntStream;

public class EquilibriumTets
{
    public static void getEquilibriumIndex(int[] arr){
        int sum= IntStream.of(arr).sum();
        int right=0;
        for (int i=0;i<arr.length;i++){
            if (right==sum-(arr[i]+right)){
               // System.err.println("right:::"+right+" arr[i]+right="+(arr[i]+right));
                System.out.println("Index is:::"+i);
            }
            right+=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={ 0, -3, 5, -4, -2, 3, 1, 0 };
        getEquilibriumIndex(arr);
    }
}
