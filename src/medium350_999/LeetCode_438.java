package medium350_999;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = 0;
        char[] S = s.toCharArray();
        char[] P = p.toCharArray();
        int[] needs = new int[26]; // 需要得到的元素
        int[] windows = new int[26]; // 滑动窗口遍历到的元素
        for (char c : P) needs[c - 'a']++;
        // 滑动窗口
        while (right < S.length) {
            // 将右窗口当前访问到的元素 curR 个数加 1
            int curR = S[right] - 'a';
            windows[curR]++;
            right++;
            // 当 window 数组中 curR 比 needs 数组中对应元素的个数要多的时候就该移动左窗口指针
            while (windows[curR] > needs[curR]) {
                // 将左窗口当前访问到的元素 curL 个数减 1
                int curL = S[left] - 'a';
                windows[curL]--;
                left++;
            }
            if (right - left == P.length) list.add(left);
        }
        return list;
    }
}
