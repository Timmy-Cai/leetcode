package jianzhi.medium25_50;

public class JIANZHI_44 {
    public int findNthDigit(int n) {
        // 0123456789101112131415
        // 1 1-9 9*1
        // 2 10-99 90*2
        // 3 100-999 900*3
        // k .....
        if (n < 10) return n;
        n--;
        long first = 1; // 10 100 1000...
        int num = 1; // 占用位数
        while (n > 9 * first * num) {
            n -= 9 * first * num;
            first *= 10;
            num++;
        }
        return String.valueOf(first + n / num).charAt(n % num) - '0';
    }
}
