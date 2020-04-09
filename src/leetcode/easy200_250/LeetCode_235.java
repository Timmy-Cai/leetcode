package leetcode.easy200_250;

import common.TreeNode;

public class LeetCode_235 {
    // 如果p、q的值都小于root，说明肯定在root的左子树中
    // 如果p、q的值都大于root，说明肯定在root的右子树中
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val)
            return p;
        if (q.val == root.val)
            return q;
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
