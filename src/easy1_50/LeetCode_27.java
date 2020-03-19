package easy1_50;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    @Test
    public void testCode() {
        int[] a1 = {3, 2, 2, 3};
        int len1 = removeElement(a1, 3); // 2 2
        assertEquals(len1, 2);
        for (int i = 0; i < len1; i++) {
            System.out.println(a1[i]);
        }
        int[] a2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int len2 = removeElement(a2, 2); // 0 1 3 0 4
        assertEquals(len2, 5);
        for (int i = 0; i < len2; i++) {
            System.out.println(a2[i]);
        }
    }
}
