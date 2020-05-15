package com.practice.collectionImplementations;

import javax.sound.midi.Soundbank;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackArray {
    private Integer[] arr;
    private int top;

    public StackArray(int capacity) {
        arr = new Integer[capacity];
    }

    public void push(Integer data) {
        if (top == arr.length) {
            Integer[] newArr = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[top++] = data;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Integer element = arr[--top];
        arr[top] = null;
        return element;
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(60);
        stack.push(20);
        stack.push(10);
       /* System.out.println("Peek is::::" + stack.peek());
        System.out.println("Stack Elements are::::");
        stack.printStack();
        System.out.println("Pop element is::::" + stack.pop());
        System.out.println("Now Peek is:::" + stack.peek());
        System.out.println("Now Elements are::::");*/
        //stack.printStack();
        System.out.println(isPalindrome(stack));
    }

    public static boolean isPalindrome(StackArray stack) {
        StackArray stack1=new StackArray(stack.size());
        int mid=stack.size()/2;
        for (int i=0;i<=mid;i++){
            if(i==mid){
                stack.pop();
            }else {
                stack1.push(stack.pop());
            }

        }
        for(int i=0;i<stack.size();i++){
            if(stack.pop()!=stack1.pop()){
                return false;
            }
        }
        return true;
    }
@Override
    public String toString(){
        return String.valueOf(arr);
}

}
