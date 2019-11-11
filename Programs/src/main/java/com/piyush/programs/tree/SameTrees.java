package com.piyush.programs.tree;

public class SameTrees {
    TreeNode root;
    public SameTrees(){
        root=null;
    }
    public static void main(String[] args){
        SameTrees tree=new SameTrees();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(3);
        tree.root.right=new TreeNode(2);
        SameTrees tree2=new SameTrees();
        tree2.root=new TreeNode(1);
        tree2.root.left=new TreeNode(2);
        tree2.root.right=new TreeNode(3);
        System.out.println(sameTrees(tree.root,tree2.root));

    }

    static boolean sameTrees(TreeNode node1,TreeNode node2){
        if(node1!=null && node2!=null){
            return ((node1.key == node2.key) &&
                    (sameTrees(node1.left, node2.left)) &&
                    (sameTrees(node1.right, node2.right)));
        }
        if(node1 == null && node2 == null)
            return true;
        return false;
    }
}
