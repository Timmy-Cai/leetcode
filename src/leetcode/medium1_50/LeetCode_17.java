package leetcode.medium1_50;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_17 {
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits != null && digits.length() != 0)
            track(digits, "", 0);
        return list;
    }

    public void track(String digits, String ans, int index) {
        if (ans.length() == digits.length()) {
            list.add(ans);
            return;
        }
        int cur = digits.charAt(index) - '0';
        for (char c : map[cur].toCharArray()) {
            track(digits, ans + c, index + 1);
        }
    }
}
