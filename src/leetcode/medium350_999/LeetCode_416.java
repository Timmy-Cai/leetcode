package leetcode.medium350_999;

public class LeetCode_416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 == 1) return false; // 奇数不符合条件
        int target = sum / 2;
        // 转换成背包问题
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num]) dp[i] = true; // 存在和为i-num的集合
            }
        }
        return dp[target];
    }
}
