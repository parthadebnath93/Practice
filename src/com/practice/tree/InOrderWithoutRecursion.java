package com.practice.tree;

import java.util.Stack;

public class InOrderWithoutRecursion {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void inorder(Node node){
        if (node==null){
            return;
        }
        Stack<Node> s=new Stack<>();
        Node curr=node;
        while (curr!=null || s.size()>0){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }

}
public static void printInorderWithoutRecursion(Node root){
        if (root==null){
            return;
        }
        Stack<Node>s=new Stack<>();
        Node curr=root;
        while (curr!=null || s.size()>0){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
}
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //inorder(root);
        printInorderWithoutRecursion(root);
    }
}
