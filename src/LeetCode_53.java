import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(maxSubArray(a), 6);
    }
}
