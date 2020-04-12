package jianzhi.medium25_50;

public class JIANZHI_49 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int aa = dp[a] * 2, bb = dp[b] * 3, cc = dp[c] * 5;
            dp[i] = Math.min(Math.min(aa, bb), cc);
            if (dp[i] == aa) a++;
            if (dp[i] == bb) b++;
            if (dp[i] == cc) c++;
        }
        return dp[n - 1];
    }
}
