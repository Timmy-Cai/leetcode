import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_70 {

    public int climbStairs(int n) {
        int[] f = new int[46];
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i < 46; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    @Test
    public void testCode() {
        assertEquals(climbStairs(2), 2);
        assertEquals(climbStairs(3), 3);
    }
}
