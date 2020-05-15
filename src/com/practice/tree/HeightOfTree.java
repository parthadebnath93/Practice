package com.practice.tree;

public class HeightOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
  public static int getHeightOfTree(Node root){
        if (root==null){
            return 0;
        }
        int left=getHeightOfTree(root.left);
        int right=getHeightOfTree(root.right);
        return (left>right?left:right)+1;
  }
    public static void main(String[] args) {
        Node node=new Node(10);
        node.left=new Node(20);
        node.left.left=new Node(25);
        node.left.right=new Node(30);
        node.right=new Node(40);
        node.left.left.left=new Node(50);
        System.out.println(getHeightOfTree(node));
    }
}
