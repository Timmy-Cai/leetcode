package jianzhi.medium25_50;

import java.util.Arrays;

public class JIANZHI_45 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) strs[i] = String.valueOf(nums[i]);
        // String 自定义排序
        // x + y > y + x => x > y
        // x + y < y + x => x < y
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s);
        return sb.toString();
    }
}
