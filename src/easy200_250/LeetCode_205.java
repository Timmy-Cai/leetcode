package easy200_250;

import java.util.HashMap;

public class LeetCode_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        HashMap<Character, Character> cmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (cmap.containsKey(c1)) { // 存在映射
                if (cmap.get(c1) != c2) return false;
            } else { // 不存在映射
                if (cmap.containsValue(c2)) return false;
                cmap.put(c1, c2);
            }
        }
        return true;
    }
}
