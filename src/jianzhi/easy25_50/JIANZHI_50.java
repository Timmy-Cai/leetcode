package jianzhi.easy25_50;

import java.util.LinkedHashMap;
import java.util.Map;

public class JIANZHI_50 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, false);
            else
                map.put(c, true);
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet())
            if (entry.getValue())
                return entry.getKey();
        return ' ';
    }
}
