package com.br0wser.tree;

import java.util.ArrayList;

/**
 * Created by browser on 16/3/4.
 */
public class Tree {

    TreeNode root;

    public TreeNode arrayToTree(Integer[] input){
        TreeNode root = createTreeNode(input,1);
        return root;
    }

    private TreeNode createTreeNode(Integer[] input, int index){
        if(index<=input.length){
            Integer value = input[index-1];
            if(value!=null){
                TreeNode t = new TreeNode(value);
                t.left = createTreeNode(input, index*2);
                t.right = createTreeNode(input, index*2+1);
                return t;
            }
        }
        return null;
    }

    public void preOrder(TreeNode node) {
        if (node!=null) {
            System.out.print(node.val + ",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        Integer[] array = new Integer[]{1,2,3,4,5,6,7};
        tree.root = tree.arrayToTree(array);
        tree.preOrder(tree.root);
    }
}
