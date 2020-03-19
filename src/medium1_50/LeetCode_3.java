package medium1_50;

public class LeetCode_3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] hash = new int[128];
        int max = 0, j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            j = Math.max(hash[c], j); // 获取到上次出现的最大索引
            max = Math.max(i - j + 1, max);
            hash[c] = i + 1;
        }
        return max;
    }
}
