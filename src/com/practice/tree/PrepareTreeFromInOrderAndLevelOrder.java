package com.practice.tree;

public class PrepareTreeFromInOrderAndLevelOrder {
    public static void main(String[] args) {
        int in[] = new int[]{4, 8, 10, 12, 14, 20, 22};
        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        int n = in.length;
        Node root=constructTree(in,level,n);
        inOrder(root);
    }
    public static Node constTree(int[]inorder,int[]preorder,int n){
        Node startNode=null;
        return consTreeUtils(inorder,preorder,0,n-1,startNode);
    }
    public static Node consTreeUtils(int[] inorder,int[] preorder,int start,int end,Node startNode){
        if (start==end){
            return new Node(inorder[start]);
        }
        if (start>end){
            return null;
        }
        int index=-1;
        boolean found=false;
        for (int i=0;i<preorder.length;i++){
            int data=preorder[i];
            for (int j=start;j<=end;j++){
                if (inorder[j]==data){
                    startNode=new Node(data);
                    found=true;
                    index=j;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        System.out.println(inorder+" "+start+" "+end+" "+startNode);
        startNode.left=consTreeUtils(inorder,preorder,start,index-1,startNode);
        startNode.right=consTreeUtils(inorder,preorder,index+1,end,startNode);
        return startNode;
    }
    public static void inOrder(Node n){
        if (n==null){
            return;
        }
        inOrder(n.left);
        System.out.print(n.data+" ");
        inOrder(n.right);
    }
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    Node root;
    public static Node constructTree(int[] inOrder,int[] levelOrder,int n){
        Node startNode=null;
        return constructTreeUtils(inOrder,levelOrder,0,n-1,startNode);
    }
    public static Node constructTreeUtils(int[] inOrder,int[] levelOrder,int startIndex,int endIndex,Node startNode){
        if (startIndex==endIndex){
            return new Node(inOrder[startIndex]);
        }
        if (startIndex>endIndex){
            return null;
        }
        int index=0;
        boolean found=false;
        for (int i=0;i<levelOrder.length;i++){
            int data=levelOrder[i];
            for (int j=startIndex;j<=endIndex;j++){
                if (inOrder[j]==data){
                    index=j;
                    startNode=new Node(data);
                    found=true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        startNode.left=constructTreeUtils(inOrder,levelOrder,0,index-1,startNode);
        startNode.right=constructTreeUtils(inOrder,levelOrder,index+1,endIndex,startNode);
        return startNode;
    }
}
