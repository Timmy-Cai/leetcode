package easy1_100;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeetCode_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    @Test
    public void testCode() {
        int[] a = {2, 7, 11, 15};
        int[] b = {0, 1};
        assertArrayEquals(twoSum(a, 9), b);
    }
}
