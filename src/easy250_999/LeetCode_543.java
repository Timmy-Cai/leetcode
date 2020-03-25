package easy250_999;

import common.TreeNode;

public class LeetCode_543 {
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        track(root);
        return ans;
    }

    // 找出以 root 为根节点的二叉树的最大深度
    public int track(TreeNode root) {
        if (root == null) return 0;
        int L = track(root.left);
        int R = track(root.right);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }
}
