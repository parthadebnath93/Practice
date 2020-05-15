package com.practice.datastructure;

import java.util.Iterator;
import java.util.Stack;

public class SortStack {
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
        System.out.println("Peek is:::"+stack.peek());
       sortStack(stack);
        Iterator itr=stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void sortStack(Stack<Integer>stack){
       if(!stack.isEmpty()){
           Integer temp=stack.pop();
           sortStack(stack);
           sortedInsert(stack,temp);
       }
    }
    public static void sortedInsert(Stack<Integer> stack,int element){
        if(stack.isEmpty() || stack.peek()<element){
            stack.push(element);
        }
        else {
            Integer temp=stack.pop();
            sortedInsert(stack,element);
            stack.push(temp);
        }
    }
}
