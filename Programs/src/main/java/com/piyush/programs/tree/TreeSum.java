package com.piyush.programs.tree;

/**
 * Created by piyushbha on 10/17/2019.
 */
public class TreeSum {
    static String leftSum="";
    static String rightSum="";
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(2);
        System.out.println(treePathsSumUtil(tree.root,0));

    }
    static int treePathsSumUtil(TreeNode node, int val)
    {
        // Base case
        if (node == null)
            return 0;

        // Update val
        val = (val * 10 + node.key);

        // if current node is leaf, return the current value of val
        if (node.left == null && node.right == null)
            return val;

        // recur sum of values for left and right subtree
        return treePathsSumUtil(node.left, val)
                + treePathsSumUtil(node.right, val);
    }
}
