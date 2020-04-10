package jianzhi.easy50_75;

import common.TreeNode;

public class JIANZHI_54 {
    private int res = 0;
    private int K = 0;

    public int kthLargest(TreeNode root, int k) {
        K = k;
        inOrder(root);
        return res;
    }

    // 中序遍历的倒序
    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.right);
        if (--K == 0) {
            res = node.val;
            return;
        }
        inOrder(node.left);
    }
}
