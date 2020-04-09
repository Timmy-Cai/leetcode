package leetcode.easy100_150;

import common.TreeNode;

public class LeetCode_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (sum - root.val == 0 && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
