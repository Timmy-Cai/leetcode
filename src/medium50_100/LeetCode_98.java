package medium50_100;

import common.TreeNode;

import java.util.Stack;

public class LeetCode_98 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        double inorder = -Double.MAX_VALUE;
        while (node != null || !stack.empty()) {
            if (node != null) { // 一直往左边走
                stack.push(node);
                node = node.left;
            } else { // 左边到头往右边走
                node = stack.pop();
                if (node.val <= inorder) return false;
                inorder = node.val; // 记录
                node = node.right;
            }
        }
        return true;
    }
}
