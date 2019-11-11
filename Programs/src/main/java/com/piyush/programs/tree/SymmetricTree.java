package com.piyush.programs.tree;

import sun.reflect.generics.tree.Tree;

public class SymmetricTree {
    TreeNode root;
    public SymmetricTree(){
        root=null;
    }
    public static void main(String[] args){
        SymmetricTree tree=new SymmetricTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(tree.root.left,tree.root.right));

    }

    static boolean isSymmetric(TreeNode node1, TreeNode node2){
        if(node1!=null && node2!=null){
            return ((node1.key == node2.key) &&
                    (isSymmetric(node1.left, node2.right)) &&
                    (isSymmetric(node1.right, node2.left)));
        }
        if(node1 == null && node2 == null)
            return true;
        return false;
    }
}
