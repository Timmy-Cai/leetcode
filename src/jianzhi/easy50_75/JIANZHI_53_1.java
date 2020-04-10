package jianzhi.easy50_75;

public class JIANZHI_53_1 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target + 0.5) - binarySearch(nums, target - 0.5);
    }

    public int binarySearch(int[] nums, double target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] > target) right = mid - 1;
        }
        return left;
    }
}
