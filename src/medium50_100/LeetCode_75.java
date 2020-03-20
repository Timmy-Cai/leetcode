package medium50_100;

public class LeetCode_75 {
    public void sortColors(int[] nums) {
        int p0 = 0; // 0边界
        int p2 = nums.length - 1; // 2边界
        int cur = 0;
        while (cur <= p2) {
            if (nums[cur] == 0) { // 交换p0和cur，p0和cur右移
                int tmp = nums[p0];
                nums[p0++] = nums[cur];
                nums[cur++] = tmp;
            } else if (nums[cur] == 2) { // 交换p2和cur，p2左移
                int tmp = nums[p2];
                nums[p2--] = nums[cur];
                nums[cur] = tmp;
            } else {
                cur++;
            }
        }
    }
}
