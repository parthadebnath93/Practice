package com.practice.datastructure;

public class EditDistanceDynamicSolution {
    public static int min(int x,int y,int z){
        if(x<=y && x<=z){
            return x;
        }
        else if (y<=x && y<=z){
            return y;
        }
        else
            return z;
    }
    public static int editDistance(String str1,String str2,int m,int n){
        int [][]res=new int [m+1][n+1];
        for (int i=0;i<=m;i++){
            for (int j=0;j<=n;j++){
                if(j==0){
                    res[i][j]=i;
                }
               else if(i==0){
                    res[i][j]=j;
                }
               else if (str1.charAt(i-1)==str2.charAt(j-1)){
                    res[i][j]=res[i-1][j-1];
                }
                else{
                    res[i][j]=1+min(res[i][j-1],res[i-1][j],res[i-1][j-1]);
                }
            }
        }
        return res[m][n];
    }
    public static void main(String[] args) {
    String str1="saturday";
    String str2="sunday";
        System.out.println("Solution is with Dynamic problem::::"+editDistance(str1,str2,str1.length(),str2.length()));
    }
}
