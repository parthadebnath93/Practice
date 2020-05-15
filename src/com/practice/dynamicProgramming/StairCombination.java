package com.practice.dynamicProgramming;

public class StairCombination {
    public static int stairs(int totalStairs){
        if (totalStairs==1){
            return 1;
        }
        if (totalStairs==2){
            return 2;
        }
        return stairs(totalStairs-1)+stairs(totalStairs-2);
    }
    public static int stairs_dp(int totalStairs){
        int[] s=new int[totalStairs];
        for (int i=0;i<totalStairs;i++){
            if (i==0){
                s[i]=1;
            }
            else if (i==1){
                s[i]=2;
            }
            else {
                s[i] = s[i - 1] + s[i - 2];
            }
        }
        return s[totalStairs-1];
    }
    public static void main(String[] args) {
        int totalStairs=5;
        System.out.println("Total Combination:::"+stairs(totalStairs));

        System.out.println("By Dp:::"+stairs_dp(totalStairs));
    }
}
