package com.practice.problemsolvinginterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDistinctCombition {
    public static void getCombition(int[] arr, List<Integer> list,int k,int i,int n){
      if(list.size()==k){
          System.out.println(list);
          return;
      }
      for (int j=i;j<n;j++){
          list.add(arr[j]);
          getCombition(arr,list,k,j,n);
          list.remove(list.size()-1);
          while (j<n-1 && arr[j]==arr[j+1]){
              j++;
          }
      }
    }
    public static void main(String[] args) {
        int[] A = { 1, 2, 1 };
        int k = 2;
        Arrays.sort(A);
        getCombition(A,new ArrayList<Integer>(),2,0,A.length);
    }
}
