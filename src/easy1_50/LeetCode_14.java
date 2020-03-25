package easy1_50;

public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        String res = "";
        for (int i = 0; i < minLength; i++) {
            for (String str : strs) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    return res;
                }
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}
