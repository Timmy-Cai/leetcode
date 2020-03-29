package medium1_50;

public class LeetCode_34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null) return new int[]{-1, -1};
        int firstIndex = find(nums, target, true);
        int lastIndex = find(nums, target, false);
        return new int[]{firstIndex, lastIndex};
    }

    public int find(int[] nums, int target, boolean isFindFirst) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) right = mid - 1;
            else if (target > nums[mid]) left = mid + 1;
            else {
                // 寻找开始位置
                if (isFindFirst) {
                    // 还能继续往左找
                    if (mid > 0 && nums[mid] == nums[mid - 1])
                        right = mid - 1;
                    else
                        return mid;
                }
                // 寻找结束位置
                else {
                    // 还能继续往右找
                    if (mid < nums.length - 1 && nums[mid] == nums[mid + 1])
                        left = mid + 1;
                    else
                        return mid;
                }
            }
        }
        return -1;
    }
}
