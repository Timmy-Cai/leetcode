package easy250_999;

import common.TreeNode;

public class LeetCode_538 {
    private int sum = 0;

    // 中序遍历
    // 左中右：升序
    // 右中左：降序
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val += sum;
        sum += root.val;
        convertBST(root.left);
        return root;
    }
}
