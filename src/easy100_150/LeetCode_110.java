package easy100_150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int balance(TreeNode root) {
        if (root == null) return 0;
        int left = balance(root.left);
        if (left == -1) return -1;
        int right = balance(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return balance(root) != -1;
    }

    @Test
    public void testCode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(isBalanced(root), true);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);
        assertEquals(isBalanced(root2), false);
    }
}
