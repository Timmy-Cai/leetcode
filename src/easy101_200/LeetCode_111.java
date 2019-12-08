package easy101_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left != null && root.right == null) return left + 1;
        if (root.left == null && root.right != null) return right + 1;
        return left < right ? left + 1 : right + 1;
    }

    @Test
    public void testCode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(minDepth(root), 2);
    }
}
