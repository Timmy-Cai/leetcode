package leetcode.medium1_50;

public class LeetCode_33 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            // 前半部分有序 2 3 4 5 6 7 1
            if (nums[left] <= nums[mid]) {
                // 目标在前半部分
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // 后半部分有序 6 7 1 2 3 4 5
            else {
                // 目标在后半部分
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
