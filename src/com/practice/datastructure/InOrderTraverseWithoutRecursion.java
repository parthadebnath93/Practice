package com.practice.datastructure;

import java.util.Stack;

public class InOrderTraverseWithoutRecursion {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
   static Node root;
    static Stack<Node>stack=new Stack<>();
    public static void inOrder(){
        Node curr=root;
        while (curr!=null || stack.size()>0){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("InOrder Traverse is::::");
        inOrder();
    }
}
