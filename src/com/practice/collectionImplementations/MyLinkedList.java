package com.practice.collectionImplementations;

public class MyLinkedList {
    int count;
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
    Node head,last;
    public void add(int data){
        if (head==null){
            addToFirst(data);
        }
        else {
            addToLast(data);
        }
    }
    public void addFirst(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        count++;
    }
    public void addLast(int data){
        addToLast(data);
    }
    private void addToFirst(int data){
        Node temp=new Node(data);
        head=last=temp;
        count++;
    }
    private void addToLast(int data){
        Node temp=new Node(data);
        last.next=temp;
        last=last.next;
        count++;
    }
    public void printLinkedList(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public int size(){
        return count;
    }
    public Node getMiddleElement(){
        Node fastPointer=head,slowPointer=head;
        while (fastPointer!=null){
            fastPointer=fastPointer.next;
            if (fastPointer!=null && fastPointer.next!=null){
                fastPointer=fastPointer.next;
                slowPointer=slowPointer.next;
            }
        }
        return slowPointer;
    }
    public void reverseLinkedList(){
        Node current=head;
        Node next=null;
        Node previous=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            head=previous;
        }
    }
    public int getDataOnIndex(int index){
        Node firstPtr=head;
        Node secPtr=head;
        for (int i=0;i<index;i++){
            firstPtr=firstPtr.next;
        }
        while (firstPtr!=null){
            firstPtr=firstPtr.next;
            secPtr=secPtr.next;
        }
        return secPtr.data;
    }
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.addFirst(5);
        list.printLinkedList();
        System.out.println();
        System.out.println("Size:::"+list.size());
      //  list.reverseLinkedList();
        //list.printLinkedList();
        Node middle=list.getMiddleElement();
        System.out.println(middle.data);
        System.out.println(list.getDataOnIndex(3));
    }
}
