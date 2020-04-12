package jianzhi.medium50_75;

public class JIANZHI_67 {
    public int strToInt(String str) {
        str = str.trim();
        if (str.equals("")) return 0;
        int sign = 1;
        int start = 0;
        if (str.charAt(0) == '+') {
            sign = 1;
            start++;
        } else if (str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        int sum = 0;
        for (int i = start; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c < 0 || c > 9) break;
            // [-2147483648, +2147483647]
            if (sign == 1)
                if ((sum > Integer.MAX_VALUE / 10) || (sum == Integer.MAX_VALUE / 10 && c >= 7))
                    return Integer.MAX_VALUE;
            if (sign == -1)
                if ((sum > Integer.MAX_VALUE / 10) || (sum == Integer.MAX_VALUE / 10 && c >= 8))
                    return Integer.MIN_VALUE;
            sum = sum * 10 + c;
        }
        return sign * sum;
    }
}
