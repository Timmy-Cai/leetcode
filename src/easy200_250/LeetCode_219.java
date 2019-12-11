package easy200_250;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LeetCode_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int preIndex = map.get(nums[i]);
                if (i - preIndex <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    @Test
    public void testCode() {
        int[] nums1 = {1, 2, 3, 1};
        assertEquals(containsNearbyDuplicate(nums1, 3), true);
        int[] nums2 = {1, 0, 0, 1};
        assertEquals(containsNearbyDuplicate(nums2, 1), true);
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        assertEquals(containsNearbyDuplicate(nums3, 2), false);
    }
}
