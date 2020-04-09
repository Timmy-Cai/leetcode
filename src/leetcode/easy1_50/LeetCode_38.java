package leetcode.easy1_50;

public class LeetCode_38 {
    public String countAndSay(int n) {
        String[] strs = new String[n + 1];
        strs[1] = "1";
        for (int i = 1; i < n; i++) {
            String s = "";
            int num = 1;
            char digit = strs[i].charAt(0);
            for (int j = 1; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == digit) {
                    num++;
                } else {
                    s += num + "" + digit;
                    num = 1;
                    digit = strs[i].charAt(j);
                }
            }
            s += num + "" + digit;
            strs[i + 1] = s;
        }
        return strs[n];
    }
}
