package com.practice.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ConvertTreeToLinkedList {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void preorder(Node root, int level, Map<Integer, Deque<Node>>map){
        if (root==null){
            return;
        }
        map.putIfAbsent(level,new ArrayDeque<>());
        if ((level & 1)==1){
            map.get(level).addFirst(root);
        }
        else {
            map.get(level).addLast(root);
        }
        preorder(root.left,level+1,map);
        preorder(root.right,level+1,map);
    }
    public static Node convert(Node root,Node head){
        Map<Integer,Deque<Node>>map=new HashMap<>();
        preorder(root,0,map);
        int n=map.size();
        for (int i=n-1;i>=0;i--){
            for (Node hm:map.get(i)){
                head=push(hm,head);
            }
        }
        return head;
    }
    public static Node push(Node root,Node head){
        if (head==null){
            head=root;
            head.left=head.right=null;
            return head;
        }
        head.left=root;
        root.right=head;
        root.left=null;
        head=root;
        return head;
    }
    public static void printLinkedList(Node node){
        while (node!=null){
            System.out.print(node.data+"->");
            node=node.right;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        inorder(root);
        Node head=null;
        head=convert(root,head);
//        inorder(head);
        printLinkedList(head);
    }
}
