package jianzhi.easy25_50;

import java.util.Stack;

public class JIANZHI_30 {
    class MinStack {
        Stack<Integer> A;
        Stack<Integer> B; // 非严格递增

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            A.push(x);
            if (B.empty() || B.peek() >= x) B.push(x);
        }

        public void pop() {
            if (B.peek().equals(A.pop())) B.pop();
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }
}
