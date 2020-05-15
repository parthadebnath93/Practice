package com.practice.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class PalindromeUsingRecursion {
    static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data=data;
        }
    }
    public static void construct(Node head,StringBuilder s1,StringBuilder s2){
        if (head==null){
            return;
        }
        s1.append(head.data);
        construct(head.next,s1,s2);
        s2.append(head.data);
    }
    public static boolean isPalindrome(Node head){
        StringBuilder s1=new StringBuilder(),s2=new StringBuilder();
        construct(head,s1,s2);
        System.out.println(s1.toString()+"  "+s2.toString());
        return s1.toString().equals(s2.toString());
    }
    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');
        System.out.println(isPalindrome(head));
    }
}
