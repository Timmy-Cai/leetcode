package jianzhi.medium50_75;

public class JIANZHI_56_1 {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        int diff = xor & -xor; // 得到最低位的1
        int a = 0, b = 0;
        for (int n : nums) {
            if ((n & diff) == 0) // 区分A和B
                a ^= n;
            else
                b ^= n;
        }
        return new int[]{a, b};
    }
}
