package com.practice.linkedlists;

import java.util.Stack;

public class Palindrome {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    int count=0;
    Node head,last;
    public void add(int data){
        if (head==null){
            addFirst(data);
        }
        else {
            addLast(data);
        }
    }
    public void addFirst(int data){
        Node temp=new Node(data);
        if (head==null){
            head=last=temp;
            count++;
        }
        else {
            temp.next=head;
            head=temp;
            count++;
        }
    }
    public void addLast(int data){
        Node temp=new Node(data);
        last.next=temp;
        last=temp;
        count++;
    }
    public void printList(){
        Node node=head;
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public boolean isPalindrome(){
        Stack<Integer>s=new Stack<>();
        Node node=head;
        while (node!=null){
            s.push(node.data);
            node=node.next;
        }
        node=head;
        while (node!=null){
            int temp=s.pop();
            if (temp!=node.data){
                return false;
            }
            node=node.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome list=new Palindrome();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        list.printList();
        if (list.isPalindrome()){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
