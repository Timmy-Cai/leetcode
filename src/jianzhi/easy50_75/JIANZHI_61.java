package jianzhi.easy50_75;

import java.util.Arrays;

public class JIANZHI_61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] != 0) {
                if (nums[4] - nums[i] >= 5) return false; // max-min>=5
                if (nums[i] == nums[i + 1]) return false; // 对子
            }
        }
        return true;
    }
}
