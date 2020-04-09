package jianzhi.easy1_25;

import java.util.Stack;

public class JIANZHI_09 {
    class CQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public CQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        public void appendTail(int value) {
            while (!out.isEmpty()) in.push(out.pop());
            in.push(value);
            while (!in.isEmpty()) out.push(in.pop());
        }

        public int deleteHead() {
            if (!out.isEmpty()) return out.pop();
            else return -1;
        }
    }
}
