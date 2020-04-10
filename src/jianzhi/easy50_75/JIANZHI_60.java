package jianzhi.easy50_75;

public class JIANZHI_60 {
    public double[] twoSum(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];
        double[] ans = new double[5 * n + 1];
        // n==1: dp[1, s] = 1
        for (int s = 1; s <= 6; s++) dp[1][s] = 1;
        // n>1: dp[n, s] = dp[n-1, s-1] + dp[n-1, s-2] + ... + dp[n-1, s-6]
        for (int i = 2; i <= n; i++) {
            for (int s = i; s <= 6 * i; s++) {
                for (int d = 1; d <= 6; d++) {
                    if (s - d <= 0) break;
                    dp[i][s] += dp[i - 1][s - d];
                }
            }
        }
        // 计算概率
        double total = Math.pow(6, n);
        for (int i = n; i <= 6 * n; i++) ans[i - n] = dp[n][i] / total;
        return ans;
    }
}
