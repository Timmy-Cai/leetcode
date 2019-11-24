import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeetCode_66 {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] >= 10) {
                carry = digits[i] / 10;
                digits[i] %= 10;
            } else {
                break;
            }
        }
        if (digits[0] == 0) {
            int a[] = new int[digits.length + 1];
            a[0] = 1;
            return a;
        }
        return digits;
    }

    @Test
    public void testCode() {
        int[] a = {1, 2, 3};
        int[] aa = {1, 2, 4};
        assertArrayEquals(plusOne(a), aa);

        int[] b = {4, 3, 2, 1};
        int[] bb = {4, 3, 2, 2};
        assertArrayEquals(plusOne(b), bb);
    }
}
