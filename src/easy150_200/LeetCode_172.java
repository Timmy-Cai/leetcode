package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        assertEquals(trailingZeroes(3), 0);
        assertEquals(trailingZeroes(5), 1);
        assertEquals(trailingZeroes(1991), 495); // 5:398 25:79 125:15 625:3
    }
}
