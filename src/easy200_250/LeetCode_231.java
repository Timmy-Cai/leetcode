package easy200_250;

public class LeetCode_231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt == 1;
    }
}
