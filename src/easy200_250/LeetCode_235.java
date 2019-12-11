package easy200_250;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LeetCode_235 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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

    @Test
    public void testCode() {
        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(2);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(9);
        node.left.right.left = new TreeNode(3);
        node.left.right.right = new TreeNode(5);
        assertEquals(lowestCommonAncestor(node, node.left, node.right), node);
        assertEquals(lowestCommonAncestor(node, node.left, node.left.right), node.left);
    }
}
