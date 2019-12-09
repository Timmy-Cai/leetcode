package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_169 {

    public int majorityElement(int[] nums) {
        int num = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                cnt++;
            } else {
                cnt--;
                if (cnt == 0) {
                    num = nums[i + 1];
                }
            }
        }
        return num;
    }

    @Test
    public void testCode() {
        int[] nums1 = {3, 2, 3};
        assertEquals(majorityElement(nums1), 3);
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(majorityElement(nums2), 2);
    }
}
