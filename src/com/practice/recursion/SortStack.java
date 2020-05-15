package com.practice.recursion;

import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer>stack){
    if(stack.isEmpty()){
        return;
    }
    else {
        Integer newEle=stack.pop();
        sortStack(stack);
        insertIntoStack(stack,newEle);
    }
    }
    public static void insertIntoStack(Stack<Integer>stack,int ele){
        if(stack.isEmpty() || stack.peek()<ele){
            stack.push(ele);
        }
        else{
            Integer newEle=stack.pop();
            insertIntoStack(stack,ele);
            stack.push(newEle);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
       /* -3    <-- top of the stack
        14
        18
                -5
        30*/
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        sortStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
