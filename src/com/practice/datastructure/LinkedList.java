package com.practice.datastructure;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node first,last;
    int count=0;
    public int size(){
        return count;
    }
    public void add(int data){
        if(first==null){
            addFirst(data);
        }
        else{
            addLast(data);
        }
    }
    public void addFirst(int data){
        Node node=new Node(data);
        first=last=node;
        count++;
    }
    public void addLast(int data){
        Node node=new Node(data);
        last.next=node;
        last=last.next;
        count++;
    }
    /*public void add(int data,int index)*//*{
        if(indxe>size+1){
            throw new UnsupportedOperationException();
        }
        Node temp=first;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(data);
    }*/
    public void printList(){
        Node currentNode=first;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
    public void reverseLinkedList(){
        Node currentNode=first;
        Node previous=null;
        Node next=null;
        while (currentNode!=null){
            next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=next;
            first=previous;

        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.printList();
        System.out.println("After reversing, list is:");
        list.reverseLinkedList();
        list.printList();
    }
}
