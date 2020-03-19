package easy1_50;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_35 {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    @Test
    public void testCode() {
        int[] a = {1, 3, 5, 6};
        assertEquals(searchInsert(a, 5), 2);
        assertEquals(searchInsert(a, 2), 1);
        assertEquals(searchInsert(a, 7), 4);
        assertEquals(searchInsert(a, 0), 0);
    }
}
