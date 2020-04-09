package leetcode.easy1_50;

public class LeetCode_28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null) return -1;
        if (needle == null) return 0;
        return haystack.indexOf(needle);
    }
}
