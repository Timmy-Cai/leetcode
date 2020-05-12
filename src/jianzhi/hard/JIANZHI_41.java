package jianzhi.hard;

import java.util.PriorityQueue;

public class JIANZHI_41 {
    class MedianFinder {
        PriorityQueue<Integer> left, right;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            left = new PriorityQueue<>((o1, o2) -> {
                return o2 - o1;
            }); // maxHeap
            right = new PriorityQueue<>(); // minHeap
        }

        public void addNum(int num) {
            left.add(num);
            right.add(left.poll());
            // 失衡
            if (left.size() < right.size()) {
                left.add(right.poll());
            }
        }

        public double findMedian() {
            // 奇数
            if (left.size() == right.size()) {
                return (left.peek() + right.peek()) / 2.0;
            }
            // 偶数
            else {
                return left.peek();
            }
        }
    }
}
