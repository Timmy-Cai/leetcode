package easy1_50;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[len - 1]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    @Test
    public void testCode() {
        int[] a1 = {1, 1, 2};
        int len1 = removeDuplicates(a1); // 1 2
        assertEquals(len1, 2);
        for (int i = 0; i < len1; i++) {
            System.out.println(a1[i]);
        }
        int[] a2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(a2); // 0 1 2 3 4
        assertEquals(len2, 5);
        for (int i = 0; i < len2; i++) {
            System.out.println(a2[i]);
        }
    }
}
