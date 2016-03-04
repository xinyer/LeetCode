package com.br0wser.tree;

/**
 * Created by browser on 16/3/4.
 */
public class Solution {


    /**
     * NO.104. Maximum Depth of Binary Tree
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

    /**
     * NO. 226 Invert Binary Tree My Submissions Question
     * Invert a binary tree.

            4
          /   \
        2     7
      / \   / \
     1   3 6   9

     to

            4
          /   \
        7     2
      / \   / \
     9   6 3   1

     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return root;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    /**
     * NO. 100 Same Tree My Submissions Question
     * Given two binary trees, write a function to check if they are equal or not.
     * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return((p==null||q==null)?(p==q):(p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)));
    }

}
