package com.practice.datastructure;

public class MyLinkedList {
    static class Node{
        int data;
        Node next,previous;
        public Node(int data){
            this.data=data;
        }
    }
    Node head,last;
    int count;
    public int size(){
        return count;
    }
    public void add(int data,boolean isHead) {
        if (isHead) {
            addFirst(data);
        } else {
            addLast(data);
        }

    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            count++;
        } else {
            head = last = newNode;
            count++;
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        last.next = newNode;
        newNode.previous = last;
        last = last.next;
        count++;
    }
    public void reverseLinkedList(){
        Node currentNode=head;
        Node next=null;
        Node previous=null;
        while (currentNode!=null){
            next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=next;
            head=previous;
        }
    }
    public void printLinkedList(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    public boolean isPalindrome(){
        int mid=size()/2;
        int i=0;
        int j=size()-1;
        Node firstNode=head;
        Node lastNode=last;
        while (i<mid && j>mid){
            if(firstNode.data!=lastNode.data){
                return false;
            }
            else {
                firstNode=firstNode.next;
                lastNode=lastNode.previous;
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(20,true);
        list.add(10,true);
        list.add(30,false);
        list.add(20,false);
        list.add(10,false);
        list.printLinkedList();
        System.out.println(list.isPalindrome());
        list.reverseLinkedList();
        System.out.println("After reverse::::");
        list.printLinkedList();
    }
}
