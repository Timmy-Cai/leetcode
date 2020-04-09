package leetcode.medium50_100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LeetCode_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.parallelSort(intervals, Comparator.comparingInt(x -> x[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            // (x0, x1) (y0, y1) 比较x1 y0
            if (list.size() == 0 || list.getLast()[1] < intervals[i][0]) {
                list.add(intervals[i]); // 不满足条件
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], intervals[i][1]); // 合并区间
            }
        }
        int[][] ans = new int[list.size()][2];
        int index = 0;
        while (!list.isEmpty()) {
            ans[index++] = list.removeFirst();
        }
        return ans;
    }
}
