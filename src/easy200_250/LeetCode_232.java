package easy200_250;

import java.util.Stack;

public class LeetCode_232 {
    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack<Integer>();
            out = new Stack<Integer>();
        }

        public void push(int x) {
            while (!out.empty()) in.push(out.pop());
            in.push(x);
            while (!in.empty()) out.push(in.pop());
        }

        public int pop() {
            return out.pop();
        }

        public int peek() {
            return out.peek();
        }

        public boolean empty() {
            return out.empty();
        }
    }
}
