package medium250_350;

public class LeetCode_338 {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            // dp(x) = dp(x/2) + (x%2)
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}
