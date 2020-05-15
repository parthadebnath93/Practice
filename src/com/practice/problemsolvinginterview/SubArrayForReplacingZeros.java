package com.practice.problemsolvinginterview;

public class SubArrayForReplacingZeros {
    public static void replace(int[] arr,int k,int n) {
        int count=0;
        int maxLength=0;
        int index=0;
        int low=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                count++;
            }
            while (count>k){
                if (arr[low]==0){
                    count--;
                }
                low++;
            }
            if (maxLength<i-low+1){
                index=low;
                maxLength=i-low+1;
            }
        }
        System.out.println("Maximum Length is::::"+maxLength+" start index is:::"+index+" end index is:"+(index+maxLength-1));
    }
    public static void main(String[] args) {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        int k = 2;
        replace(A,k,A.length);
    }
}
