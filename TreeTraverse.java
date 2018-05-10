package com.stream.chenhong.lib;

public class TreeTraverse {

    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int value;
    }

    public static void main(String[] args){

        TreeNode treeNode=new TreeNode();
        treeNode.value=1;

        TreeNode treeNode2=new TreeNode();
        treeNode2.value=3;

        TreeNode treeNode3=new TreeNode();
        treeNode3.value=4;

        TreeNode treeNode4=new TreeNode();
        treeNode4.value=10;

        treeNode.left=treeNode2;
        treeNode.right=treeNode3;
        treeNode2.left=treeNode4;


        preOrder(treeNode);
        System.out.println("");
        inOrder(treeNode);
        System.out.println("");
        nextOrder(treeNode);






    }


    private static void preOrder(TreeNode root){

        //中左右
        if(root==null) return;

        System.out.print(root.value+",");
        //递归调左子树
        preOrder(root.left);
        preOrder(root.right);



    }

    private static void inOrder(TreeNode root){
        if(root==null) return;
        //左中右
        inOrder(root.left);
        System.out.print(root.value+",");
        //递归调左子树

        inOrder(root.right);
    }


    private static void  nextOrder(TreeNode root){
        if(root==null) return;
        //左右中
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.value+",");
    }
}
