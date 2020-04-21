package helloworld;

import java.util.Scanner;

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}

public class BinaryTree {
    private static String data;
    private static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        data = sc.next(); // abc##de#g##f###
        i = 0;

        TreeNode root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static TreeNode buildTree() {
        TreeNode treeNode = null;
        if (data.charAt(i) == '#') {
            i++;
        } else {
            treeNode = new TreeNode(data.charAt(i));
            i++;
            treeNode.left = buildTree();
            treeNode.right = buildTree();
        }
        return treeNode;
    }

    public static void preOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val);
            preOrder(treeNode.left);
            preOrder(treeNode.right);
        }
    }

    public static void inOrder(TreeNode treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.left);
            System.out.print(treeNode.val);
            inOrder(treeNode.right);
        }
    }

    public static void postOrder(TreeNode treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.print(treeNode.val);
        }
    }
}
