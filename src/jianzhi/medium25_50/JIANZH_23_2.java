package jianzhi.medium25_50;

import common.TreeNode;

import java.util.*;

public class JIANZH_23_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int qlen = queue.size();
            for (int i = 0; i < qlen; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (ans.size() % 2 == 1) Collections.reverse(list);
            ans.add(list);
        }
        return ans;
    }
}
