package easy250_999;

public class LeetCode_461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int sum = 0;
        while (z != 0) {
            sum += z & 1;
            z >>= 1;
        }
        return sum;
    }
}
