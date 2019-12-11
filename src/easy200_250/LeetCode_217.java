package easy200_250;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class LeetCode_217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    @Test
    public void testCode() {
        int[] nums1 = {1, 2, 3, 1};
        assertEquals(containsDuplicate(nums1), true);
        int[] nums2 = {1, 2, 3, 4};
        assertEquals(containsDuplicate(nums2), false);
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertEquals(containsDuplicate(nums3), true);
    }
}
