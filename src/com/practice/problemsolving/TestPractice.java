package com.practice.problemsolving;

import java.util.*;

enum Name{
    Alice, Smith, Bob, Jones
}
public class TestPractice {
    final int num = 10;
    public void display()
    {
        int num =12;
        Runnable r = new Runnable(){
            final int num = 15;
            public void run(){
                int num = 20;
                System.out.println(this.num);
            }
        };
        r.run();
    }
    public static boolean isPrime(int n){
        int i,m=0,flag=0;
        if(n==0 || n==1){
            flag=1;
        }
        m=n/2;
        for (i=2;i<=m;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        else  {
            return true;
        }
    }
    public static void main(String[] args) {
      TestPractice p=new TestPractice();
      p.display();


//        int[] a
//        rr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int primeCount=-1;
//        for (int i=0;i<arr.length;i++){
//            if(i<2 && i%2 !=0)
//            if(isPrime(arr[i])){
//                primeCount++;
//                swapElements(arr,primeCount,i);
//            }
//        }
//        Arrays.sort(arr,0,primeCount);
//        Arrays.sort(arr,primeCount+1,arr.length-1);
//        swapForDesc(arr,primeCount+1,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
    public static void swapForDesc(int [] arr,int l,int r){
        int mid=(l+r)/2;
        for (int i=l;i<mid;i++){
            int temp=arr[i];
            arr[i]=arr[r];
            arr[r]=temp;
            r--;
        }
    }
    public static void swapElements(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
