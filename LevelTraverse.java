package com.hdyl.android.lib;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraverse {

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

     LinkedList<TreeNode> queue=new LinkedList<TreeNode>();

     leverTraverse(root,queue);





    }

    private static void preOrder(TreeNode root){

        //中左右
        if(root==null) return;

        System.out.print(root.value+",");
        //递归调左子树
        preOrder(root.left);
        preOrder(root.right);

    }


    private static void leverTraverse(TreeNode root, LinkedList<TreeNode> queue){

        if(root==null) return;

        System.out.print(root.value+"|");

        if(root.left!=null){
            queue.add(root.left);
        }

        if(root.right!=null){
            queue.add(root.right);
        }

        if(queue.size()==0) return;
        leverTraverse(queue.pop(),queue);

    }




}
