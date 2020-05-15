package com.practice.problemsolving;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class RunningMediun {
    public static void findRunningMediun(int []arr){
        Queue<Integer>smaller=new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer>greater=new PriorityQueue<>();
        double med=arr[0];
        smaller.add(arr[0]);
        System.out.println(med);
        for (int i=1;i<arr.length;i++){
            int x=arr[i];
            if(smaller.size()>greater.size()){
                if(x<med){
                  greater.add(smaller.remove());
                  smaller.add(x);
                }
                else {
                    greater.add(x);
                }
                med=(double) (smaller.peek()+greater.peek())/2;
            }
            else if(smaller.size()==greater.size()){
                if(x<med){
                    smaller.add(x);
                    med=smaller.peek();
                }
                else {
                    greater.add(x);
                    med=greater.peek();
                }
            }
            else{
                if(x>med){
                    smaller.add(greater.remove());
                    greater.add(x);
                }
                else{
                    smaller.add(x);
                }
                med=(double)(greater.peek()+smaller.peek())/2;
            }
            System.out.println(med);
        }
        System.out.println("Min Queue is:::"+smaller);
        System.out.println("Greater Queue is:::"+greater);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        findRunningMediun(arr);
    }
}
