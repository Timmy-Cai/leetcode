package easy200_250;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        assertEquals(isAnagram("anagram", "nagaram"), true);
        assertEquals(isAnagram("rat", "car"), false);
    }
}
