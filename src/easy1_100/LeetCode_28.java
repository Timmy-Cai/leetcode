package easy1_100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_28 {

    public int strStr(String haystack, String needle) {
        if (haystack == null) return -1;
        if (needle == null) return 0;
        return haystack.indexOf(needle);
    }

    @Test
    public void testCode() {
        assertEquals(strStr("hello", "ll"), 2);
        assertEquals(strStr("aaaaa", "bba"), -1);
    }
}
