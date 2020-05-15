package com.practice.datastructure;

public class HeightOfAtree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static int getHeight(Node node){
        if (node==null){
            return 0;
        }
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        return (left>right?left:right)+1;
    }

    public static void main(String[] args) {
        Node node=new Node(50);
        node.left=new Node(50);
        node.left.left=new Node(50);
        node.left.right=new Node(50);
        node.left.left.right=new Node(50);
        node.left.left.left=new Node(50);
        node.left.left.left.left=new Node(50);
        node.right=new Node(50);
        node.right.left=new Node(50);
        node.right.right=new Node(50);
        System.out.println("Height is::::"+getHeight(node));

    }
}
