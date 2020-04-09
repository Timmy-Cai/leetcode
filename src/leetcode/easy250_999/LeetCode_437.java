package leetcode.easy250_999;

import common.TreeNode;

public class LeetCode_437 {
    private int ans = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        // 以根节点递归
        track(root, sum);
        // 以左节点递归
        pathSum(root.left, sum);
        // 以右节点递归
        pathSum(root.right, sum);
        return ans;
    }

    public void track(TreeNode root, int sum) {
        if (root == null) return;
        if (sum - root.val == 0) ans++;
        track(root.left, sum - root.val);
        track(root.right, sum - root.val);
    }
}
