package easy150_200;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeetCode_155 {

    class MinStack {

        List<Integer> li;

        public MinStack() {
            li = new ArrayList<>();
        }

        public void push(int x) {
            li.add(x);
        }

        public void pop() {
            li.remove(li.size() - 1);
        }

        public int top() {
            return li.get(li.size() - 1);
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (Integer i : li)
                if (i < min)
                    min = i;
            return min;
        }
    }

    @Test
    public void testCode() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(minStack.getMin(), -3);
        minStack.pop();
        assertEquals(minStack.top(), 0);
        assertEquals(minStack.getMin(), -2);
    }
}
