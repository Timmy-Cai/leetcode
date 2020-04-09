package leetcode.easy50_100;

import common.TreeNode;

public class LeetCode_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val == q.val)
            return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
        else
            return false;
    }
}
