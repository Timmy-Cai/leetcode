package leetcode.medium350_999;

public class LeetCode_494 {
    private int ans = 0;

    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, S, 0, 0);
        return ans;
    }

    public void dfs(int[] nums, int S, int sum, int cur) {
        if (cur == nums.length) {
            if (S == sum) ans++;
            return;
        }
        dfs(nums, S, sum + nums[cur], cur + 1);
        dfs(nums, S, sum - nums[cur], cur + 1);
    }
}
