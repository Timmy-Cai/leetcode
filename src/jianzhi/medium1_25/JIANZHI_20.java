package jianzhi.medium1_25;

public class JIANZHI_20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;
        boolean hasNum = false;
        boolean hasE = false;
        boolean hasDot = false;
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                hasNum = true;
            } else if (c == '.') {
                // 不能出现.和e
                if (hasDot || hasE) return false;
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                // 不能出现e，必须出现num
                if (hasE || !hasNum) return false;
                hasE = true;
                hasNum = false; // 重置num
            } else if (c == '+' || c == '-') {
                // +-出现在0位置或者e/E后面的第一个位置才是合法的
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else {
                return false;
            }
        }
        return hasNum;
    }
}
