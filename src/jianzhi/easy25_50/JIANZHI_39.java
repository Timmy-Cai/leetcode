package jianzhi.easy25_50;

public class JIANZHI_39 {
    public int majorityElement(int[] nums) {
        int target = 0, cnt = 0;
        for (int n : nums) {
            if (cnt == 0) target = n;
            cnt += n == target ? 1 : -1; // 众数投票
        }
        return target;
    }
}
