package medium200_250;

import common.TreeNode;

public class LeetCode_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, q, p);
        TreeNode right = lowestCommonAncestor(root.right, q, p);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }
}
