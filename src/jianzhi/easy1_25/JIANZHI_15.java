package jianzhi.easy1_25;

public class JIANZHI_15 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n & 1;
            n >>>= 1;
        }
        return ans;
    }
}
