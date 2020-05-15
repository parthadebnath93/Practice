package com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;

public class CommonLeasetAncestor {
    static Node node;
    private static List<Integer> path1 = new ArrayList<>();
    private static List<Integer> path2 = new ArrayList<>();

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static int findLCA(int n1, int n2) {
        path1.clear();
        path2.clear();
        return findLCAInternal(node,n1,n2);
    }

    private static int findLCAInternal(Node node, int n1, int n2) {
        if (!findPath(node,n1,path1) || !findPath(node,n2,path2)){
            System.out.println(path1.size()>0?"n1 is present ":"n1 is missing");
            System.out.println(path2.size()>0?"n2 is present":"n2 is missing");
            return -1;
        }
        int i;
        for(i=0;i<path1.size() && i<path2.size();i++){
            if(!path1.get(i).equals(path2.get(i))){
                break;
            }
        }
        return path1.get(i-1);
    }

    public static boolean findPath(Node node, int data, List<Integer> path) {
        if(node==null){
            return false;
        }
        path.add(node.data);
        if(node.left!=null){
            findPath(node.left,data,path);
           return true;
        }
        if(node.right!=null){
            findPath(node.right,data,path);
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static void main(String[] args) {
        node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        System.out.println("Ancestor is ::::"+findLCA(4,5));
    }
}
