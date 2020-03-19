package medium1_50;

public class LeetCode_4 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0, end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (j + 1 == i) dp[j][i] = s.charAt(j) == s.charAt(i);
                else dp[j][i] = dp[j + 1][i - 1] && s.charAt(j) == s.charAt(i);
                if (dp[j][i] && i - j > end - start) {
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
