package com.practice.stringproblems;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        Stack<Character>s=new Stack<>();
        for (int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
        Integer.parseInt(str);
    }
}
