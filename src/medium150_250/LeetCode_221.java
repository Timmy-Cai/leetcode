package medium150_250;

public class LeetCode_221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = m > 0 ? matrix[0].length : 0;
        int[][] dp = new int[m + 1][n + 1];
        int maxlen = 0;
        // 多申请了一行一列
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 1 1 1    1 1 1
                // 1 1 1 => 1 2 2
                // 1 1 1    1 2 3
                // 短板定律
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxlen = Math.max(dp[i][j], maxlen);
                }
            }
        }
        return maxlen * maxlen;
    }
}
