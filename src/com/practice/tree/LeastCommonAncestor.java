package com.practice.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeastCommonAncestor {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    List<Integer>path1=new ArrayList<>();
    List<Integer>path2=new ArrayList<>();
    Node root;
    public  int findlca(Node root,int n1,int n2){
        path1.clear();
        path2.clear();
        return findLcaInternal(root,n1,n2);
    }
    public  int findLcaInternal(Node root,int n1,int n2){
        if (!findPath(path1,n1,root) || !findPath(path2,n2,root)){
            System.out.println(path1.size()>0?"n1 is present":"n1 is not present");
            System.out.println(path2.size()>0?"n2 is present":"n2 is not present");
        }
        int index=-1;
        for (index=0;index<path1.size() && index<path2.size();index++){
            if (path1.get(index)!=path2.get(index)){
                break;
            }
        }
        return path1.get(index-1);
    }
    public  boolean findPath(List<Integer>path,int n,Node root){
        if (root==null){
            return false;
        }
        path.add(root.data);
        if (root.data==n){
            return true;
        }
        if (root.left!=null && findPath(path,n,root.left)){
            return true;
        }
        if (root.right!=null && findPath(path,n,root.right)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static void main(String[] args) {
        LeastCommonAncestor tree=new LeastCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println( tree.findlca(tree.root,4,5));
    }
}
