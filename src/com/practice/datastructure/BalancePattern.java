package com.practice.datastructure;

import java.util.Stack;

public class BalancePattern {
    public static boolean isMathing(char character1,char character2){
        if (character1 =='{' && character2=='}') {
            return  true;
        }
        else if(character1=='(' && character2==')'){
            return false;
        }
        else if(character1=='[' && character2==']'){
            return true;
        }
        return  false;
    }
    public static boolean isValidParam(char[]arr){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('|| arr[i]=='{' || arr[i]=='['){
                stack.push(arr[i]);
            }
             if (arr[i]=='}'|| arr[i]==')' ||arr[i]==']'){
                 if(stack.isEmpty()){
                     return false;
                 }
                 else if (!isMathing(stack.pop(),arr[i])){
                     return false;
                 }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        char exp[] = {'{','(',')','}','[',']'};
        if (isValidParam(exp)){
            System.out.println("Balanced:::::");
        }else{
            System.out.println("Not Balanced::::");
        }
    }
}
