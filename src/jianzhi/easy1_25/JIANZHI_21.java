package jianzhi.easy1_25;

public class JIANZHI_21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                int tmp = nums[i];
                nums[i] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
        return nums;
    }
}
