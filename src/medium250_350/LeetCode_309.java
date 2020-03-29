package medium250_350;

public class LeetCode_309 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        // 在第i天所能获得的最大收益
        // 0 不持股
        // 1 持股
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(0, prices[1] - prices[0]);
        dp[1][1] = Math.max(-prices[0], -prices[1]);
        for (int i = 2; i < len; i++) {
            dp[i][0] = Math.max(
                    dp[i - 1][0], // 不持股 → 不持股
                    dp[i - 1][1] + prices[i]); // 持股 → 不持股
            dp[i][1] = Math.max(
                    dp[i - 1][1], // 持股 → 持股
                    dp[i - 2][0] - prices[i]); // 不持股 → 持股（冷冻期）
        }
        return dp[len - 1][0];
    }
}
