package com.piyush.programs.tree;


import sun.reflect.generics.tree.Tree;

public class KthSmallestNodeInBinaryTree {
    TreeNode root;
    public KthSmallestNodeInBinaryTree(){
        root=null;
    }
    private static int counter;
    public static void main(String[] args){
        KthSmallestNodeInBinaryTree tree=new KthSmallestNodeInBinaryTree();
        tree.root=new TreeNode(3);
        tree.root.left=new TreeNode(2);
        tree.root.left.left=new TreeNode(1);
        tree.root.left.right=new TreeNode(4);
        tree.root.right=new TreeNode(5);
        System.out.println(getKSmallestElement(tree.root,1).key);
    }

    static TreeNode getKSmallestElement(TreeNode node,int k){
        if(node==null)
            return null;
        TreeNode nodeToFind=getKSmallestElement(node.left,k);
        if(counter != k){
            counter++;
            nodeToFind = node;
        }
       if(counter == k){
            return nodeToFind;
        }else{
            counter++;
            return getKSmallestElement(node.left,k);
        }


    }
}
