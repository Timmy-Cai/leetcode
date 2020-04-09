package leetcode.medium150_250;

import common.TreeNode;

public class LeetCode_114 {
    private TreeNode pre = null;

    public void flatten(TreeNode root) {
        dfs(root);
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        // 右节点-左节点-根节点
        dfs(node.right);
        dfs(node.left);
        node.left = null;
        node.right = pre;
        pre = node;
    }
}
