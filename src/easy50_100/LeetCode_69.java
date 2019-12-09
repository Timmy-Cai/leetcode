package easy50_100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_69 {

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    @Test
    public void testCode() {
        assertEquals(mySqrt(4), 2);
        assertEquals(mySqrt(8), 2);
    }
}
