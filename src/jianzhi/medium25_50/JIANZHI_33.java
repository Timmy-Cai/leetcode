package jianzhi.medium25_50;

import java.util.Stack;

public class JIANZHI_33 {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>(); // 存储递增的节点
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root)
                return false;
            // 更新父节点
            while (!stack.isEmpty() && postorder[i] < stack.peek())
                root = stack.pop();
            stack.push(postorder[i]);
        }
        return true;
    }
}
