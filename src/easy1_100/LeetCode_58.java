package easy1_100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_58 {

    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        if (ss.length == 0) {
            return 0;
        } else {
            return ss[ss.length - 1].length();
        }
    }

    @Test
    public void testCode() {
        assertEquals(lengthOfLastWord("Hello World"), 5);
    }
}
