package leetcode.easy250_999;

public class LeetCode_557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        for (String str : strs) {
            sb.append(new StringBuilder(str).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
