import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testCode() {
        assertEquals(isValid("()"), true);
        assertEquals(isValid("()[]{}"), true);
        assertEquals(isValid("(]"), false);
        assertEquals(isValid("([)]"), false);
        assertEquals(isValid("{[]}"), true);
    }
}
