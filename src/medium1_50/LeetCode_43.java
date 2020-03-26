package medium1_50;

public class LeetCode_43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length(), len2 = num2.length(), len = len1 + len2;
        int[] ans = new int[len]; // 相乘
        for (int i = len1 - 1; i >= 0; i--) {
            int c = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int cc = num2.charAt(j) - '0';
                ans[i + j + 1] += c * cc;
            }
        }
        int carry = 0; // 进位
        for (int i = len - 1; i >= 0; i--) {
            ans[i] += carry;
            carry = ans[i] / 10;
            ans[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; ; ++i) if (ans[i] != 0) break;
        for (; i < len; i++) sb.append(ans[i]);
        return sb.toString();
    }
}
