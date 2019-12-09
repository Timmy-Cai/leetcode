package easy100_150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<Integer>();
            li.add(1);
            for (int j = 1; j < i; j++) {
                Integer num = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                li.add(num);
            }
            if (i != 0) li.add(1);
            result.add(li);
        }
        return result;
    }

    @Test
    public void testCode() {
        List<List<Integer>> result = generate(5);
        for (List<Integer> li : result) {
            for (Integer i : li) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
