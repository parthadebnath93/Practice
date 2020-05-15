package com.practice.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAlternativeLevels {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void resverseAlternative(Node root){
        Queue<Node>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        int n;
        Node temp;
        int level=1;
        q.add(root);
        while (!q.isEmpty()){
            n=q.size();
            while (n!=0){
                if (!q.isEmpty()){
                    temp=q.peek();
                    q.remove();
                }
               else {
                   temp=null;
                }
               if (level%2!=0){
                   if (temp!=null && temp.left!=null){
                        q.add(temp.left);
                        s.push(temp.left.data);
                   }
                   if (temp!=null && temp.right!=null){
                        q.add(temp.right);
                        s.push(temp.right.data);
                   }
               }
               else {
                    temp.data=s.peek();
                    s.pop();
                    if (temp.left!=null){
                        q.add(temp.left);
                    }
                    if (temp.right!=null){
                        q.add(temp.right);
                    }
               }
                n--;
            }
            level++;
        }
    }
    public static void reverse(Node root){
        Stack<Integer>s=new Stack<>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int n,level=1;
        Node temp;
        while (!q.isEmpty()){
            n=q.size();
            while (n!=0){
                if (!q.isEmpty()){
                    temp=q.peek();
                    q.remove();
                }
                else {
                    temp=null;
                }
                if (level%2!=0){
                    if (temp!=null && temp.left!=null){
                        q.add(temp.left);
                        s.push(temp.left.data);
                    }
                    if (temp!=null && temp.right!=null){
                        q.add(temp.right);
                        s.push(temp.right.data);
                    }
                }
                else {
                    temp.data=s.peek();
                    s.pop();
                    if (temp.left!=null){
                        q.add(temp.left);
                    }
                    if (temp.right!=null){
                        q.add(temp.right);
                    }
                }
                n--;
            }
            level++;
        }
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        System.out.println("Before Operation::::");
        inOrder(root);
        System.out.println();
        System.out.println("After the operation::::");
        //reverse(root);
        resverseAlternative(root);
        inOrder(root);
    }
}
