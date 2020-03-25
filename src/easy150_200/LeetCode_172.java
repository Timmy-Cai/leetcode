package easy150_200;

public class LeetCode_172 {
    // 分解5质因数
    public int trailingZeroes(int n) {
        int result = 0;
        while (n != 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}
