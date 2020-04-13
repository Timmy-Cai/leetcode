package jianzhi.medium25_50;

public class JIANZHI_36 {
    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        inorder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        if (pre != null) pre.right = node;
        else head = node; // 指向链表中有最小元素的节点
        node.left = pre;
        pre = node;
        inorder(node.right);
    }
}
