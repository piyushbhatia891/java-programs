package com.piyush.programs.tree;

public class SmallestElementInTree {
    TreeNode root;
    public SmallestElementInTree(){
        root=null;
    }
    public static void main(String[] args){
        SmallestElementInTree tree=new SmallestElementInTree();
        tree.root=new TreeNode(2);
        tree.root.left=new TreeNode(1);
        tree.root.right=new TreeNode(2);
        System.out.println(getSmallestElement(tree.root));
    }
    static int getSmallestElement(TreeNode node){
        TreeNode current=node;
        while(current.left!=null){
            current=current.left;
        }
        return current.key;
    }
}
