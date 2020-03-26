package medium1_50;

public class LeetCode_8 {
    public int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        int sign = 1, start = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        if (str.charAt(0) == '+') {
            sign = 1;
            start++;
        }
        int num = 0;
        for (int i = start; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c < 0 || c > 9) break;
            // [-2147483648, +2147483647]
            if (sign == 1) {
                if ((num > Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && c >= 7))
                    return Integer.MAX_VALUE;
            } else {
                if ((num > Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && c >= 8))
                    return Integer.MIN_VALUE;
            }
            num = num * 10 + c;
        }
        return sign * num;
    }
}
