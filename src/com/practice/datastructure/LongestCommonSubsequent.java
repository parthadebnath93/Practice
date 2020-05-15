package com.practice.datastructure;

public class LongestCommonSubsequent {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int lcs(char[]X,char[]Y,int n1,int n2){
        int [][]K=new int [n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0||j==0){
                    K[i][j]=0;
                }
               else if(X[i-1]==Y[j-1]){
                    K[i][j]=(K[i-1][j-1])+1;
                }
                else{
                    K[i][j]=max(K[i][j-1],K[i-1][j]);
                }
            }
        }
        return K[n1][n2];
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println("Longest Common SubSequent is::::"+lcs(X,Y,m,n));
    }
}
