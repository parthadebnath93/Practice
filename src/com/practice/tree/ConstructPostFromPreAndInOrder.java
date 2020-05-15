package com.practice.tree;

public class ConstructPostFromPreAndInOrder {
    static class Node{
        char data;
        Node left,right;
        public Node(char data){
            this.data=data;
        }
    }
    int index=0;
    Node root;
    public Node constructTreeUtils(char[] inorder,char[]preorder,int start,int end){
        if (start>end){
            return null;
        }
        Node temp=new Node(preorder[index++]);
        if (start==end){
            return temp;
        }
        int ind=search(inorder,start,end,temp.data);
        temp.left=constructTreeUtils(inorder,preorder,start,ind-1);
        temp.right=constructTreeUtils(inorder,preorder,ind+1,end);
        return temp;
    }
    public int search(char[]inorder,int start,int end,int data){
        int index;
        for (index=start;index<=end;index++){
            if (inorder[index]==data){
                return index;
            }
        }
        return -1;
    }
    public Node constructTree(char[]inorder,char[]preorder,int n){
        return constructTreeUtils(inorder,preorder,0,n-1);
    }
    public void printPostOrder1(Node root){
        if (root==null){
            return;
        }
        printPostOrder1(root.left);
        printPostOrder1(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        char inorder[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char preorder[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = inorder.length;
        ConstructPostFromPreAndInOrder tree=new ConstructPostFromPreAndInOrder();
        tree.root=tree.constructTree(inorder,preorder,len);
        tree.printPostOrder1(tree.root);
    }
}
