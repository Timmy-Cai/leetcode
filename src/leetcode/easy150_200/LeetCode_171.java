package leetcode.easy150_200;

public class LeetCode_171 {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
