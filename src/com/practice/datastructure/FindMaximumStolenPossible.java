package com.practice.datastructure;

public class FindMaximumStolenPossible {
    public int mxLoot(int []arr,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        int []dp=new int [n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i=2;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return  dp[n-1];
    }

    public static void main(String[] args) {
        int hval[] = {6, 7, 1, 3, 8, 2, 4};
        int n = hval.length;
        FindMaximumStolenPossible prb=new FindMaximumStolenPossible();
        System.out.println(prb.mxLoot(hval,n));
    }
}
