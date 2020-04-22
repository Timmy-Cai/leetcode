package helloworld;

import java.util.Stack;

/**
 * 拓扑排序：删除入度为 0 的顶点和所有出边
 * 关键路径：最早开始时间 = 最晚开始时间
 * <p>
 * 最短路径：
 * Dijkstra 迪杰斯特拉-单源
 * Floyd 弗洛伊德-多源
 * <p>
 * 最小生成树：
 * Prim 普里姆-加点法
 * Kruskal 克鲁斯卡尔-加边法
 */
public class BinaryTree {
    static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    private static final String data = "abc##de#g##f###";
    private static int i = 0;

    public static void main(String[] args) {
        TreeNode root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static TreeNode buildTree() {
        TreeNode node = null;
        if (data.charAt(i) == '#') {
            i++;
        } else {
            node = new TreeNode(data.charAt(i));
            i++;
            node.left = buildTree();
            node.right = buildTree();
        }
        return node;
    }

    public static void preOrder(TreeNode node) {
        // if (node != null) {
        //     System.out.print(node.val);
        //     preOrder(node.left);
        //     preOrder(node.right);
        // }
        if (node == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            System.out.print(n.val);
            if (n.right != null) stack.push(n.right);
            if (n.left != null) stack.push(n.left);
        }
    }

    public static void inOrder(TreeNode node) {
        // if (node != null) {
        //     inOrder(node.left);
        //     System.out.print(node.val);
        //     inOrder(node.right);
        // }
        if (node == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode n = stack.pop();
            System.out.print(n.val);
            if (n.right != null) cur = n.right;
        }
    }

    public static void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val);
        }
        // difficult
    }
}
