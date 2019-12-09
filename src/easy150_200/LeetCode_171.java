package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_171 {

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    @Test
    public void testCode() {
        assertEquals(titleToNumber("A"), 1);
        assertEquals(titleToNumber("AB"), 28);
        assertEquals(titleToNumber("ZY"), 701);
    }
}
