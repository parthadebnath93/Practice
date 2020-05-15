package com.practice.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BreadthFirstSearch {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void levelSum(Node root,int[] sum,int lvl){
        if (root==null){
            return;
        }
        sum[lvl]+=root.data;
        levelSum(root.left,sum,lvl+1);
        levelSum(root.right,sum,lvl+1);
    }
    public static int getHeight(Node root){
        if (root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return (left>right?left:right)+1;
    }
    public static void levelMaxSum(Node root){
        Queue<Node> que=new LinkedList<Node>();
        que.add(root);
        while (!que.isEmpty()){
            int sum=0;
            int n=que.size();
            for (int i=0;i<n;i++){
                    sum+=que.peek().data;
                   Node temp= que.remove();
                if (temp.left!=null){
                    que.add(temp.left);
                }
                if (temp.right!=null){
                    que.add(temp.right);
                }
            }
            System.out.println("Sum:::"+sum);
        }
    }
    public static void leverTraverse(Node root){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int n=q.size();
            for (int i=0;i<n;i++){
                System.out.print(q.peek().data+" ");
                Node temp=q.remove();
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }
    public static void printLevelSum(Node root){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()){
           int n=q.size();
           int sum=0;
           for (int i=0;i<n;i++){
                sum+=q.peek().data;
                Node temp=q.remove();
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
           }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int height=getHeight(root);
        System.out.println("Height is:::"+height);
        int[] levelSum=new int[height];
        levelSum(root,levelSum,0);
        System.out.println(Arrays.toString(levelSum));
       // levelMaxSum(root);
        System.out.println();
      //  printLevelSum(root);
        leverTraverse(root);
    }
}
