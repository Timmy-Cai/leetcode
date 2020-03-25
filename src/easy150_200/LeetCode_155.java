package easy150_200;

import java.util.ArrayList;
import java.util.List;

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
}
