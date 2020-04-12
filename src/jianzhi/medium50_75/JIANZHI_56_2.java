package jianzhi.medium50_75;

public class JIANZHI_56_2 {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        // 初始 => 0 0
        // 1个1 => 1 0
        // 2个1 => 0 1
        // 3个1 => 0 0
        for (int n : nums) {
            one = one ^ n & ~two;
            two = two ^ n & ~one;
        }
        return one;
    }
}
