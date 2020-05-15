package com.practice.problemsolvinginterview;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][]arr={{1,0,0},{0,1,0},{0,0,1}};
        int row=arr.length;
        int col=arr[0].length;
        if (row!=col){
            System.out.println("not Following identity property");
        }
        else {
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    if (i==j && arr[i][j]!=1){
                        System.out.println("Not an identity matrix:::");
                    }
                }
            }
            System.out.println("Identity matrix::::");
        }
    }
}
