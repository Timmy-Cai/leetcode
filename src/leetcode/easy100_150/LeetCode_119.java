package leetcode.easy100_150;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {
    // C(n,i) = n!/(i!*(n-i)!)
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        long cur = 1;
        for (int i = 0; i <= rowIndex / 2; i++) {
            result.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
            result.add(result.get(rowIndex - i));
        }
        return result;
    }
}
