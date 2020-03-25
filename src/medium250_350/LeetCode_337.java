package medium250_350;

import common.TreeNode;

public class LeetCode_337 {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int leftMoney = rob(root.left); // 左节点
        int rightMoney = rob(root.right); // 右节点
        int leftChildLeftMoney = 0; // 左节点的左节点
        int leftChildRightMoney = 0; // 左节点的右节点
        int rightChildLeftMoney = 0; // 右节点的左节点
        int rightChildRightMoney = 0; // 左节点的右节点
        if (root.left != null) {
            leftChildLeftMoney = rob(root.left.left);
            leftChildRightMoney = rob(root.left.right);
        }
        if (root.right != null) {
            rightChildLeftMoney = rob(root.right.left);
            rightChildRightMoney = rob(root.right.right);
        }
        // 1. 两个儿子偷的钱
        // 2. 爷爷偷的钱 + 四个孙子偷的钱
        return Math.max(leftMoney + rightMoney, root.val + leftChildLeftMoney + leftChildRightMoney + rightChildLeftMoney + rightChildRightMoney);
    }
}
