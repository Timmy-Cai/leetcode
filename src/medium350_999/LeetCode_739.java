package medium350_999;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode_739 {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        // T[stack[-1]] < T[stack[-2]] < ... 严格递增
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
