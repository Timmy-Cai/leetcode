package medium350_999;

import java.util.Arrays;

public class LeetCode_621 {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char c : tasks) count[c - 'A']++;
        Arrays.sort(count);
        int maxCount = count[25]; // 数量最多的任务
        int diff = 0; // 最后一个桶的大小
        for (int value : count) {
            if (value == maxCount)
                diff++;
        }
        int ans = (maxCount - 1) * (n + 1) + diff;
        return Math.max(ans, tasks.length);
    }
}
