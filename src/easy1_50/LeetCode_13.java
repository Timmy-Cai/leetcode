package easy1_50;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LeetCode_13 {

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int res = 0;
        for (String str : map.keySet()) {
            if (s.contains(str)) {
                s = s.replace(str, "");
                res += map.get(str);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }

    @Test
    public void testCode() {
        assertEquals(romanToInt("III"), 3);
        assertEquals(romanToInt("IV"), 4);
        assertEquals(romanToInt("IX"), 9);
        assertEquals(romanToInt("LVIII"), 58);
        assertEquals(romanToInt("MCMXCIV"), 1994);
    }
}
