package com.practice.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllTreeNodesFromLeftBFS {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Node root;
    public static void printNodes(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node tempNode=queue.poll();
            System.out.print(tempNode.data+" ");
            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if(null!=tempNode.right){
                queue.add(tempNode.right);
            }
        }

    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        printNodes();
    }
}
