package medium150_200;

public class LeetCode_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imin = 1, imax = 1;
        for (int i = 0; i < nums.length; i++) {
            // 交换最大最小值
            if (nums[i] < 0) {
                int tmp = imin;
                imin = imax;
                imax = tmp;
            }
            // 最大的连续子数组
            imin = Math.min(imin * nums[i], nums[i]); // 维护最小数
            imax = Math.max(imax * nums[i], nums[i]); // 维护最大数
            max = Math.max(imin, max);
        }
        return max;
    }
}
