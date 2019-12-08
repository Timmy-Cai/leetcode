package easy101_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_125 {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    @Test
    public void testCode() {
        assertEquals(isPalindrome("A man, a plan, a canal: Panama"), true);
        assertEquals(isPalindrome("race a car"), false);
    }
}
