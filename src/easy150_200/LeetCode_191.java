package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_191 {

    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>= 1;
        }
        return result;
    }

    @Test
    public void testCode() {
        assertEquals(hammingWeight(11), 3); // 00000000000000000000000000001011
        assertEquals(hammingWeight(128), 1); // 00000000000000000000000010000000
//        assertEquals(hammingWeight(4294967293), 31); // 11111111111111111111111111111101
    }
}
