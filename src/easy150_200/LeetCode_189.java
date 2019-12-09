package easy150_200;

import org.junit.Test;

public class LeetCode_189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    @Test
    public void testCode() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7}; // [5,6,7,1,2,3,4]
        rotate(nums1, 3);
        for (int i : nums1) {
            System.out.print(i + " ");
        }

        int[] nums2 = {-1, -100, 3, 99}; // [3,99,-1,-100]
        rotate(nums2, 2);
        for (int i : nums2) {
            System.out.print(i + " ");
        }
    }
}
