package easy100_150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_136 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    @Test
    public void testCode() {
        int[] a1 = {2, 2, 1};
        assertEquals(singleNumber(a1), 1);
        int[] a2 = {4, 1, 2, 1, 2};
        assertEquals(singleNumber(a2), 4);
    }
}
