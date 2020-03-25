package easy50_100;

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
}
