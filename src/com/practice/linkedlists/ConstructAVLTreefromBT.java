package com.practice.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class ConstructAVLTreefromBT {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node convertToAVL(List<Integer>list,int start,int end){
        if (start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(list.get(mid));
        root.left=convertToAVL(list,start,mid-1);
        root.right=convertToAVL(list,mid+1,end);
        return root;
    }
    public static void inorderTreversal(Node root, List<Integer> list){
        if (root==null){
            return;
        }
        inorderTreversal(root.left,list);
        list.add(root.data);
        inorderTreversal(root.right,list);
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(15);
        root.left.left = new Node(10);
        root.left.left.left = new Node(5);
        root.left.left.left.left = new Node(2);
        root.left.left.left.right = new Node(8);
        List<Integer>list=new ArrayList<>();
        inorderTreversal(root,list);
        root=convertToAVL(list,0,list.size()-1);
        preOrder(root);
    }
}
