package easy1_100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int xx = x;
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res == xx;
    }

    @Test
    public void testCode() {
        assertEquals(isPalindrome(121), true);
        assertEquals(isPalindrome(-121), false);
        assertEquals(isPalindrome(10), false);
    }
}
