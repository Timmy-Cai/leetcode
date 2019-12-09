package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_168 {

    public String convertToTitle(int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            char carry = (char) ((n - 1) % 26 + 'A');
            sb.append(carry);
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }

    @Test
    public void testCode() {
        assertEquals(convertToTitle(1), "A");
        assertEquals(convertToTitle(28), "AB");
        assertEquals(convertToTitle(701), "ZY");
    }
}
