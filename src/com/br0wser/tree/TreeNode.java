package com.br0wser.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by browser on 16/3/4.
 */


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int leftOrRight = 0;// 0: root;-1:left child node;1, right childe node;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode create(int[] array) {
        TreeNode node;

        node = new TreeNode(array[0]);
        node.left = new TreeNode(array[1]);
        node.right = new TreeNode(array[2]);


        return node;
    }

}
