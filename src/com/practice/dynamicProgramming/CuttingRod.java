package com.practice.dynamicProgramming;

import java.util.Arrays;

public class CuttingRod {
    public static int prices(int[] prices,int n){
        if (n==0){
            return 0;
        }
        int maxVal=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int temp=prices(prices,i)+prices[n-i-1];
            if (temp>maxVal){
                maxVal=temp;
            }
        }
        return maxVal;
    }
    public static int revenue_dp(int[] prices,int n){
        int[] sol=new int[n+1];
        sol[0] = 0;
//        for (int i=0;i<n;i++){
//            int max = sol[0] + prices[i];
//            for(int j=1;j<=i/2;j++){
//                max = max < sol[j] + sol[i-j+1] ?  sol[j] + sol[i-j+1] : max;
//            }
//            sol[i+1]=max;
//        }
        for (int i=0;i<n;i++){
            int max=sol[0]+prices[i];
            for (int j=1;j<=i/2;j++){
                max=max<sol[j]+sol[i-j+1]?sol[j]+sol[i-j+1]:max;
            }
            sol[i+1]=max;
        }

//        for (int i=1;i<n;i++){
//            for (int j=1;j<i;j++){
//                sol[i]=Integer.max(sol[i],sol[i-j]+sol[j]);
//            }
//        }
        return sol[n];
    }
    public static void main(String[] args) {
        int[] prices={1,5,8,9,10};
        System.out.println("Max Val::::"+prices(prices,5));

        System.out.println("By using dp:::"+revenue_dp(prices,prices.length));
    }
}
