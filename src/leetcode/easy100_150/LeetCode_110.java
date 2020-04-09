package leetcode.easy100_150;

import common.TreeNode;

public class LeetCode_110 {
    public int balance(TreeNode root) {
        if (root == null) return 0;
        int left = balance(root.left);
        if (left == -1) return -1;
        int right = balance(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return balance(root) != -1;
    }
}
