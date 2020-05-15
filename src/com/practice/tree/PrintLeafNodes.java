package com.practice.tree;

public class PrintLeafNodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node printLeafNodes(Node root){
        if (root==null){
            return root;
        }
        root.left=printLeafNodes(root.left);

        root.right=printLeafNodes(root.right);
        if (root.right==null || root.left==null){
            System.out.print(root.data+" ");
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);

        printLeafNodes(root);
    }
}
