package medium150_250;

public class LeetCode_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        // 首先从左侧遍历，得到answer数组
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // 然后从右侧遍历，修改answer数组
        int R = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            answer[i] *= R;
            R *= nums[i];
        }
        return answer;
    }
}
