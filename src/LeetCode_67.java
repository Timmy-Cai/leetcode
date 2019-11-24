import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_67 {

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            int len = a.length() - b.length();
            for (int i = 0; i < len; i++) {
                b = '0' + b;
            }
        }
        if (b.length() > a.length()) {
            int len = b.length() - a.length();
            for (int i = 0; i < len; i++) {
                a = '0' + a;
            }
        }
        int carry = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int tmp = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
            carry = tmp / 2;
            res = (tmp % 2) + res;
        }
        if (carry != 0) {
            return carry + res;
        }
        return res;
    }

    @Test
    public void testCode() {
        assertEquals(addBinary("11", "1"), "100");
        assertEquals(addBinary("1010", "1011"), "10101");
    }
}
