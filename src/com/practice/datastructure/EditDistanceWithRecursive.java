package com.practice.datastructure;

public class EditDistanceWithRecursive {
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
    public static int editDist(String str1,String str2,int n,int m){
        if(n==0){
            return m;
        }
        if (m==0){
            return n;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return editDist(str1,str2,n-1,m-1);
        }
        return 1+min(editDist(str1,str2,n,m-1),editDist(str1,str2,n-1,m),editDist(str1,str2,n-1,m-1));
    }
    public static void main(String[] args) {
        String str1="saturday";
        String str2="sunday";
        System.out.println("Solution is::::"+editDist(str1,str2,str1.length(),str2.length()));
    }
}
