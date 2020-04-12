package jianzhi.medium50_75;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class JIANZHI_59_2 {
    class MaxQueue {
        Queue<Integer> queue; // 队列：插入和删除
        Deque<Integer> deque; // 双端队列：获取最大值（非严格递减）

        public MaxQueue() {
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int max_value() {
            return deque.size() > 0 ? deque.peek() : -1;
        }

        public void push_back(int value) {
            queue.offer(value); // queue队首
            while (deque.size() > 0 && deque.peekLast() < value) deque.pollLast();
            deque.offerLast(value); // deque队尾
        }

        public int pop_front() {
            int tmp = queue.size() > 0 ? queue.poll() : -1;
            if (deque.size() > 0 && tmp == deque.peek()) deque.poll();
            return tmp;
        }
    }
}
