package com.piyush.programs.tree;



public class BinaryTree {
    TreeNode root;
    public BinaryTree(){
        root=null;
    }
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(2);
        printInOrder(tree.root);
        printPreOrder(tree.root);
        printPostOrder(tree.root);
    }

    static void printPostOrder(TreeNode node){
        if(node==null)
            return;

        System.out.println(node.key +" ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }
    static void printInOrder(TreeNode node){
        if(node==null)
            return;
        printInOrder(node.left);
        System.out.println(node.key +" ");
        printInOrder(node.right);

    }
    static void printPreOrder(TreeNode node){
        if(node==null)
            return;

        System.out.println(node.key +" ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }
}
