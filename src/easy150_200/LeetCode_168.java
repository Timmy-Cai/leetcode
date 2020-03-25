package easy150_200;

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
}
