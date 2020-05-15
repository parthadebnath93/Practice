package com.practice.tree;

public class PrepareBST {
    static  class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public  static  Node prepareBST(Node node,int data){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(node.data>data){
            node.left=prepareBST(node.left,data);
        }
        if(node.data<data){
            node.right=prepareBST(node.right,data);
        }
        return node;
    }
    public static void printInOrder(Node node){
        if(node==null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }
    public static void main(String[] args) {
        Node node=null;
        node=prepareBST(node,10);
        node=prepareBST(node,20);
        node=prepareBST(node,30);
        node=prepareBST(node,15);
        node=prepareBST(node,13);
        node=prepareBST(node,25);
        node=prepareBST(node,5);
        printInOrder(node);

    }
}
