package jianzhi.easy50_75;

import common.TreeNode;

public class JIANZHI_55_2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    public int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = maxDepth(node.left) + 1;
        int right = maxDepth(node.right) + 1;
        return Math.max(left, right);
    }
}
