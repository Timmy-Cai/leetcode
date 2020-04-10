package jianzhi.easy50_75;

public class JIANZHI_59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        int[] ans = new int[nums.length - k + 1];
        int maxIndex = -1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            // 还在范围内，比较最后一个
            if (maxIndex >= i) {
                if (nums[i + k - 1] > max) {
                    max = nums[i + k - 1];
                    maxIndex = i + k - 1;
                }
            }
            // 不在范围内，重新遍历
            else {
                max = Integer.MIN_VALUE;
                for (int j = i; j < i + k; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        maxIndex = j;
                    }
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}
