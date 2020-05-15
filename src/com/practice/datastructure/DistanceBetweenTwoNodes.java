package com.practice.datastructure;

public class DistanceBetweenTwoNodes {
    static int d1 = -1;
    static int d2 = -1;
    static int dist = 0;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static int findLevel(Node node,int key,int level){
        if(node ==null){
            return -1;
        }
        if(node.data==key){
            return level;
        }
        int l=findLevel(node.left,level+1,key);
        return (l !=-1)?1:findLevel(node.right,level+1,key);
    }
    static Node findDistanceUtils(Node node,int n1,int n2,int level){
        if(node==null){
            return null;
        }
        if(node.data==n1){
            d1=level;
            return node;
        }
        if(node.data==n2){
            d2=node.data;
            return node;
        }
        Node left=findDistanceUtils(node.left,n1,n2,level+1);
        Node right=findDistanceUtils(node.right,n1,n2,level+1);
        if(left!=null && right!=null){
            dist=(d1+d2)-2*level;
            return node;
        }
        return (left !=null?left:right);
    }
    static int findDistance(Node root,int n1,int n2) {
        dist = 0;
        d1 = -1;
        d2 = -1;
        Node left = findDistanceUtils(root, n1, n2, 1);
        System.out.println("Returned Node data is:::"+left.data);
        if (d1 != -1 && d2 != -1) {
            System.out.println("Came to 1st block:::");
            return dist;
        }
        if (d1 != -1) {
            System.out.println("Came to 2nd block");
            dist=findLevel(left, n2, 0);
            return dist;
        }
        if (d2 != -1) {
            System.out.println("Came to 3rd block::::");
          dist= findLevel(left, n1, 0);
            return dist;
        }
        System.out.println("Did not satisfy any condition:::");

        return -1;
    }
    public static void main(String[] args) {
        Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        System.out.println("Distance::::"+findDistance(root,4,7));
    }
}
