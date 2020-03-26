package medium1_50;

import java.util.Arrays;

public class LeetCode_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = nums[0] + nums[1] + nums[2];
        int sum, left, right;
        // 每次遍历固定一个数字
        for (int i = 0; i < nums.length; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - best)) best = sum;
                if (sum < target) left++;
                else if (sum > target) right--;
                else return best;
            }
        }
        return best;
    }
}
