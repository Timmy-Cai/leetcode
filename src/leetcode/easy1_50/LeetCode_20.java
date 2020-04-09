package leetcode.easy1_50;

import java.util.Stack;

public class LeetCode_20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (stack.empty()) {
                stack.push(cc);
                continue;
            }
            char c = (char) stack.peek();
            if (c == '(' && cc == ')')
                stack.pop();
            else if (c == '[' && cc == ']')
                stack.pop();
            else if (c == '{' && cc == '}')
                stack.pop();
            else
                stack.push(cc);
        }
        return stack.empty();
    }
}
