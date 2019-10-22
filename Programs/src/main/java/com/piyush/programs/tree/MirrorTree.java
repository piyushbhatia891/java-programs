package com.piyush.programs.tree;


public class MirrorTree {
    TreeNode root;
    public MirrorTree(){
        root=null;
    }
    public static void main(String[] args){
        MirrorTree tree=new MirrorTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(3);
        tree.root.right=new TreeNode(2);
        printInOrderTraversal(tree.root);
        System.out.println();
        mirrorNodes(tree.root);
        printInOrderTraversal(tree.root);
    }

    static void printInOrderTraversal(TreeNode node){
        if(node!=null){
            printInOrderTraversal(node.left);
            System.out.print(node.key +" ");
            printInOrderTraversal(node.right);
        }
    }

    static TreeNode mirrorNodes(TreeNode node){
        if(node!=null) {
            TreeNode left = mirrorNodes(node.left);
            TreeNode right = mirrorNodes(node.right);
            node.left = right;
            node.right = left;
        }
        return node;
    }
}
