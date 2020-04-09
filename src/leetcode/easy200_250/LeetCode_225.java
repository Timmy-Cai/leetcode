package leetcode.easy200_250;

import java.util.LinkedList;
import java.util.Queue;


public class LeetCode_225 {

    class MyStack {
        Queue<Integer> in;
        Queue<Integer> out;

        public MyStack() {
            in = new LinkedList<Integer>();
            out = new LinkedList<Integer>();
        }

        public void push(int x) {
            in.add(x);
            while (!out.isEmpty()) in.add(out.poll());
            while (!in.isEmpty()) out.add(in.poll());
        }

        public int pop() {
            return out.poll();
        }

        public int top() {
            return out.peek();
        }

        public boolean empty() {
            return out.isEmpty();
        }
    }
}
