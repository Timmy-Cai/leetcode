package jianzhi.hard;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class JIANZHI_37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("null,");
            } else {
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] strs = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // 左子树
            if (!strs[i].equals("null")) {
                TreeNode tmp = new TreeNode(Integer.parseInt(strs[i]));
                node.left = tmp;
                queue.add(tmp);
            }
            i++;
            // 右子树
            if (!strs[i].equals("null")) {
                TreeNode tmp = new TreeNode(Integer.parseInt(strs[i]));
                node.right = tmp;
                queue.add(tmp);
            }
            i++;
        }
        return root;
    }
}
