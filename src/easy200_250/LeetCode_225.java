package easy200_250;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(2);
        myStack.push(0);
        assertEquals(myStack.pop(), 0);
        assertEquals(myStack.top(), 2);
        assertEquals(myStack.empty(), false);
    }
}
