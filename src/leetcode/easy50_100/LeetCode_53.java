package leetcode.easy50_100;

public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < 0) {
                tmp = 0;
            }
        }
        return max;
    }
}
