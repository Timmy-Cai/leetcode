package easy150_200;

public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                cnt++;
            } else {
                cnt--;
                if (cnt == 0) {
                    num = nums[i + 1];
                }
            }
        }
        return num;
    }
}
