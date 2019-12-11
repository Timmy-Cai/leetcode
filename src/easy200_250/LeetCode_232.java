package easy200_250;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(5);
        myQueue.push(2);
        myQueue.push(0);
        assertEquals(myQueue.pop(), 5);
        assertEquals(myQueue.peek(), 2);
        assertEquals(myQueue.empty(), false);
    }
}
