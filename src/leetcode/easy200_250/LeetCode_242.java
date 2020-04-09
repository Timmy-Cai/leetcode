package leetcode.easy200_250;

import java.util.HashMap;

public class LeetCode_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            Integer n = map.get(c);
            if (n == null) {
                return false;
            } else if (n > 1) {
                map.put(c, n - 1);
            } else {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
