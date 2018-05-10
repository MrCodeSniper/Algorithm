package com.stream.chenhong.lib;

/**
 * Created by Administrator on 2018\5\10 0010.
 */

public class OverturnTree {


    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public String value;
    }

    public static void main(String[] args){

        TreeNode root=new TreeNode();
        root.value="A";
        TreeNode root1=new TreeNode();
        root1.value="B";
        TreeNode root2=new TreeNode();
        root2.value="C";
        TreeNode root3=new TreeNode();
        root3.value="D";
        TreeNode root4=new TreeNode();
        root4.value="E";
        TreeNode root5=new TreeNode();
        root5.value="F";
        TreeNode root6=new TreeNode();
        root6.value="G";


        root.left=root1;
        root.right=root2;
        root1.left=root3;
        root1.right=root4;

        root2.left=root5;
        root2.right=root6;

        preOrder(root);

        System.out.println("");

        OverturnTree(root);

        preOrder(root);






    }



    private static void OverturnTree(TreeNode root){
        TreeNode temp=null;

        if(root==null) return;

        //左右倒置
        temp=root.left;
        root.left=root.right;
        root.right=temp;

        OverturnTree(root.left);
        OverturnTree(root.right);




    }

    private static void preOrder(TreeNode root){

        //中左右
        if(root==null) return;

        System.out.print(root.value+",");
        //递归调左子树
        preOrder(root.left);
        preOrder(root.right);



    }

    private static void inOrder(TreeTraverse.TreeNode root){
        if(root==null) return;
        //左中右
        inOrder(root.left);
        System.out.print(root.value+",");
        //递归调左子树

        inOrder(root.right);
    }


    private static void  nextOrder(TreeTraverse.TreeNode root){
        if(root==null) return;
        //左右中
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.value+",");
    }







}
