package leetcode.medium350_999;

public class LeetCode_560 {
    public int subarraySum(int[] nums, int k) {
        int sum, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) ans++;
            }
        }
        return ans;
    }
}
