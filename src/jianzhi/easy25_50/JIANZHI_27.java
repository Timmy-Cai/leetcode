package jianzhi.easy25_50;

import common.TreeNode;

public class JIANZHI_27 {
    public TreeNode mirrorTree(TreeNode root) {
        helper(root);
        return root;
    }

    private void helper(TreeNode node) {
        if (node == null) return;
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
        helper(node.left);
        helper(node.right);
    }
}
