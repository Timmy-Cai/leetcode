package jianzhi.medium25_50;

public class JIANZHI_46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1; // 空字符串
        dp[1] = 1; // 初始字符
        for (int i = 1; i < s.length(); i++) {
            dp[i + 1] += dp[i];
            int digit = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (10 <= digit && digit <= 25) // 可以组成10-25
                dp[i + 1] += dp[i - 1];
        }
        return dp[s.length()];
    }
}
