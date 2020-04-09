package leetcode.easy1_50;

public class LeetCode_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int xx = x;
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res == xx;
    }
}
