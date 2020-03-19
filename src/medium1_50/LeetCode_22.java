package medium1_50;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_22 {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n != 0)
            track("", n, n);
        return list;
    }

    // l 左括号有多少可以使用
    // r 右括号有多少可以使用
    public void track(String ans, int l, int r) {
        if (l == 0 && r == 0) {
            list.add(ans);
            return;
        }
        if (l > r) return; // 剪枝
        if (l > 0) track(ans + "(", l - 1, r);
        if (r > 0) track(ans + ")", l, r - 1);
    }
}
