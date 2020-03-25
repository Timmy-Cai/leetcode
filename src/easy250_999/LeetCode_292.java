package easy250_999;

public class LeetCode_292 {
    public boolean canWinNim(int n) {
        // 堆中石头的数量 n 不能被 4 整除
        return n % 4 != 0;
    }
}
