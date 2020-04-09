package leetcode.easy100_150;

import common.TreeNode;

public class LeetCode_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left != null && root.right == null) return left + 1;
        if (root.left == null && root.right != null) return right + 1;
        return left < right ? left + 1 : right + 1;
    }
}
