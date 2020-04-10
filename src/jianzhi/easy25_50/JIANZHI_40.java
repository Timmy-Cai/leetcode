package jianzhi.easy25_50;

import java.util.PriorityQueue;
import java.util.Queue;

public class JIANZHI_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) return new int[0];
        Queue<Integer> queue = new PriorityQueue<>((x1, x2) -> x2 - x1); // 大顶堆
        for (int n : arr) {
            if (queue.size() < k) {
                queue.offer(n);
            } else if (!queue.isEmpty() && n < queue.peek()) {
                queue.poll();
                queue.offer(n);
            }
        }
        int[] ans = new int[k];
        int i = 0;
        while (!queue.isEmpty()) ans[i++] = queue.poll();
        return ans;
    }
}
