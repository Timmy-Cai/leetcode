package leetcode.easy200_250;

import java.util.HashSet;

public class LeetCode_202 {
    public int getSquare(int n) {
        int m = 0;
        while (n != 0) {
            m += Math.pow(n % 10, 2);
            n /= 10;
        }
        return m;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> happySet = new HashSet<>();
        while (n != 1) {
            n = getSquare(n);
            if (happySet.contains(n)) return false;
            happySet.add(n);
        }
        return true;
    }
}
