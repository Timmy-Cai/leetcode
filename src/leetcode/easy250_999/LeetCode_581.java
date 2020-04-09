package leetcode.easy250_999;

import java.util.Arrays;

public class LeetCode_581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int start = 0, end = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != nums[i]) {
                start = i;
                break;
            }
        }
        for (int i = tmp.length - 1; i >= 0; i--) {
            if (tmp[i] != nums[i]) {
                end = i;
                break;
            }
        }
        if (start == end) return 0;
        return end - start + 1;
    }
}
