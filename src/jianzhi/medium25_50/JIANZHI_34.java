package jianzhi.medium25_50;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JIANZHI_34 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, sum, new LinkedList<>());
        return ans;
    }

    public void helper(TreeNode node, int sum, LinkedList<Integer> tmpList) {
        if (node == null) return;
        sum -= node.val;
        tmpList.add(node.val);
        if (sum == 0 && node.left == null && node.right == null) ans.add(new ArrayList<>(tmpList));
        helper(node.left, sum, tmpList);
        helper(node.right, sum, tmpList);
        tmpList.removeLast();
    }
}
