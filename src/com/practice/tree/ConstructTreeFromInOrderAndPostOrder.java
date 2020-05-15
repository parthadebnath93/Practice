package com.practice.tree;

public class ConstructTreeFromInOrderAndPostOrder {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    int index;
    Node root;
    public  Node constructTreeUtils(int[] inorder,int[] postorder,int start,int end){
        if (start>end){
            return null;
        }
        Node temp=new Node(postorder[index--]);
        if (start==end){
            return temp;
        }
        int ind=search(inorder,start,end,temp.data);
        temp.right=constructTreeUtils(inorder,postorder,ind+1,end);
        temp.left=constructTreeUtils(inorder,postorder,start,ind-1);
        return temp;
    }
    public  int search(int[] inorder,int start,int end,int data){
        for (int i=start;i<=end;i++){
            if (inorder[i]==data){
                return i;
            }
        }
        return -1;
    }
    public  Node constructTree(int[] inoredr,int[] postorder){
        index=inoredr.length-1;
        return constructTreeUtils(inoredr,postorder,0,inoredr.length-1);
    }
    public void printPostOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        printPostOrder(root.left);
        printPostOrder(root.right);
    }
    public static void main(String[] args) {
        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
        ConstructTreeFromInOrderAndPostOrder tree=new ConstructTreeFromInOrderAndPostOrder();
        tree.root=tree.constructTree(in,post);
        tree.printPostOrder(tree.root);
    }
}
