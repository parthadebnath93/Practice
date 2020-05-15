package com.practice.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TreeFromLevelAndInorder {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node buildTreeUtils(Node startNode,int[] inorder, int[] levelorder, int start, int end){
        if (start>end){
            return null;
        }
        if (start==end){
            return new Node(inorder[start]);
        }
        int index=0;
        boolean found=false;
        for (int i=0;i<levelorder.length;i++){
            int data=levelorder[i];
            for (int j=start;j<=end;j++){
                if (inorder[j]==data){
                    index=j;
                    found=true;
                    startNode=new Node(data);
                }
            }
        }
        startNode.left=buildTreeUtils(startNode.left,inorder,levelorder,start,index-1);
        startNode.right=buildTreeUtils(startNode.right,inorder,levelorder,index+1,end);
        return startNode;
    }
    public static Node buildTree(int[] inorder,int[] levelorder){
        Node startNode=null;
        return buildTreeUtils(startNode,inorder,levelorder,0,inorder.length-1);
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        Stack<Node> s=new Stack<>();
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
        int in[] = new int[]{4, 8, 10, 12, 14, 20, 22};
        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        int n = in.length;
        Node root=buildTree(in,level);
        inorder(root);
    }
}
