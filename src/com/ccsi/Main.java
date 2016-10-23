package com.ccsi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeNode head=buildTree();
        head.inorderDfs();
    }
    public static TreeNode buildTree(){
        TreeNode root =new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public void preorderDfs(){
        System.out.println(this.val);
        if(this.left!=null)this.left.preorderDfs();
        if(this.right!=null)this.right.preorderDfs();
    }

    public void inorderDfs(){
        if(this.left!=null)this.left.inorderDfs();
        System.out.println(this.val);
        if(this.right!=null)this.right.inorderDfs();
    }

    public void bfs(){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(this);
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            System.out.println(curr.val);
            if(curr.left!=null)queue.offer(curr.left);
            if(curr.right!=null)queue.offer(curr.right);
        }
    }
}






