package leetcode.medium150_250;

import common.TreeNode;

public class LeetCode_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) return null;
        // 找到根节点在中序遍历的位置
        int index = 0;
        while (inorder[iStart + index] != preorder[pStart])
            index++;
        // 重建子树
        // [3] [9] [20, 15, 7]
        // [9] [3] [15, 20, 7]
        TreeNode node = new TreeNode(preorder[pStart]);
        node.left = helper(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
        node.right = helper(preorder, pStart + index + 1, pEnd, inorder, iStart + index + 1, iEnd);
        return node;
    }
}
