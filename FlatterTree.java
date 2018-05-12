package com.lexj.lib;

public class FlatterTree {

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


        TreeNode flat_tree=flatTree(root);

        preOrder(flat_tree);






    }



    private static TreeNode flatTree(TreeNode root){


        if(root==null){
            return null;
        }

        TreeNode flat_left=flatTree(root.left);
        TreeNode flat_right=flatTree(root.right);

        root.left=null;
        root.right=null;

        if(flat_left==null){
            root.right=flat_right;
            return root;
        }


        root.right=flat_left;

        TreeNode lastLeftNode=flat_left;

        while (lastLeftNode!=null&&lastLeftNode.right!=null){
            lastLeftNode=lastLeftNode.right;
        }


        lastLeftNode.right=flat_right;



        return root;


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
        nextOrder(root.left);
        nextOrder(root.right);
        System.out.print(root.value+",");
    }

}
