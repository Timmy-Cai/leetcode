package jianzhi.easy50_75;

import java.util.ArrayList;
import java.util.List;

public class JIANZHI_57_2 {
    public int[][] findContinuousSequence(int target) {
        int left = 1, right = 1, sum = 0;
        List<int[]> ans = new ArrayList<>();
        while (left <= target / 2) {
            if (sum < target) { // 右边界向右移动
                sum += right;
                right++;
            } else if (sum > target) { // 左边界向右移动
                sum -= left;
                left++;
            } else {
                int[] arr = new int[right - left];
                for (int k = left; k < right; k++) arr[k - left] = k;
                ans.add(arr);
                sum -= left; // 调整边界
                left++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
