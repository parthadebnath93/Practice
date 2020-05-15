package com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class LowestCommonAncestorTest {
    static Node root;
    static List<Integer>path1=new ArrayList<>();
    static List<Integer>path2=new ArrayList<>();
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static int findLCA(int n1,int n2){
        path1.clear();
        path2.clear();
        return findPathLCA(root,n1,n2);

    }
    public static int findPathLCA(Node root,int n1,int n2){
        if(!findPath(root,n1,path1) || !findPath(root,n2,path2)){
            System.out.println(path1.size()>0?"n1 is present":"n1 is missing");
            System.out.println(path2.size()>0?"n2 is present":"n2 is missing");
            return -1;
        }
        int i;
        for( i=0;i<path1.size() && i<path2.size();i++){
            if(!path1.get(i).equals(path2.get(i))){
                break;
            }
        }
        return path1.get(i-1);
    }
    public static boolean findPath(Node root,int n,List<Integer>path){
        if (root==null)
            return false;
        path.add(root.data);
        if(root.data==n){
            return true;
        }
        if(root.left !=null && findPath(root.left, n, path)){
            return true;
        }
        if (root.right !=null && findPath(root.right,n,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static int findLevel(Node node,int key,int level) {
        if (node == null) {
            return 0;
        }
        if (node.data == key) {
            return level;
        }
        int downnLevel = findLevel(node.left, key, level + 1);
        if (downnLevel != 0) {
            return downnLevel;
        }

        downnLevel = findLevel(node.right, key, level + 1);
        return downnLevel;
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Ancestor is::::"+findLCA(4,5));
        int key=findLCA(4,5);
        //int d1=findLevel()
        ReentrantLock lock=new ReentrantLock();
        ConcurrentHashMap<Integer,Integer>map=new ConcurrentHashMap<>();
    }
}
