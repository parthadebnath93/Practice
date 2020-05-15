package com.practice.datastructure;

public class DoubleLinkedList {

    static class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node first;
    Node last;
    int count;

    public int size() {
        return count;
    }

    public void add(int data) {
        if (first == null) {
            addFirst(data);
        } else {
            addLast(data);
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (first != null) {
            node.previous = first.previous;
            node.next = first;
            first = node;
            count++;
        } else if (first == null) {
            last = first = node;
            count++;
        }
    }

    public boolean isPalindrome() {
        Node firstNode = first;
        Node lastNode = last;
        int mid = count / 2;
        int firstIndex = 0;
        int lastIndex = count - 1;
        while (firstIndex < mid && lastIndex > mid) {
            if (firstNode.data != lastNode.data) {
                return false;
            }
            firstNode = firstNode.next;
            lastNode = lastNode.previous;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        last.next = node;
        node.previous = last;
        last = last.next;
        count++;
    }

    public void printList() {
        Node currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void getFirstAndLast() {
        System.out.println();
        System.out.println("First is:::" + first.data);
        System.out.println("Last is::::" + last.data);
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        list.printList();
        list.getFirstAndLast();
        System.out.println(list.isPalindrome());
    }
}
