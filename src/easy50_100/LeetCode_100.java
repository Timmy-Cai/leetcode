package easy50_100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_100 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val == q.val)
            return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
        else
            return false;
    }

    @Test
    public void testCode() {
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);
        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);
        assertEquals(isSameTree(p1, q1), true);

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(3);
        assertEquals(isSameTree(p2, q2), false);

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);
        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);
        assertEquals(isSameTree(p3, q3), false);
    }
}
