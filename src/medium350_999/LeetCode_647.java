package medium350_999;

public class LeetCode_647 {
    public int countSubstrings(String s) {
        int ans = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        // dp[i][j]表示s[i, j]为回文串
        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                // s[i] == s[j]
                // 只有一个字符：a
                // 只有两个字符：aa
                // 两个字符以上：aba
                // dp[i+1][j-1]
                // i, i+1, ..., j-1, j
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
