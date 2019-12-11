package easy200_250;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        assertEquals(isPowerOfTwo(1), true);
        assertEquals(isPowerOfTwo(16), true);
        assertEquals(isPowerOfTwo(218), false);
    }
}
