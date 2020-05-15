package com.practice.datastructure;

public class FindLevelForGivenNode {
    static Node root;
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static int findLevel(Node root,int level,int key){
        if(root==null){
            return 0;
        }
        if(root.data==key){
            return level;
        }
        int leftLevel=findLevel(root.left,level+1,key);
        if(leftLevel !=0){
            return leftLevel;
        }
         leftLevel=findLevel(root.right,level+1,key);
        return leftLevel;
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Level is::::"+(findLevel(root,0,4)+1));
    }
}
