package medium350_999;

import java.util.Stack;

public class LeetCode_394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder sub = new StringBuilder();
                while (stack.peek() != '[')
                    sub.append(stack.pop()); // 弹出字母
                stack.pop(); // 弹出[
                StringBuilder mulStr = new StringBuilder();
                while (!stack.isEmpty() && '0' <= stack.peek() && stack.peek() <= '9')
                    mulStr.append(stack.pop()); // 弹出数字
                int mul = Integer.parseInt(mulStr.reverse().toString());
                for (int i = 0; i < mul; i++)
                    for (int j = sub.length() - 1; j >= 0; j--)
                        stack.push(sub.charAt(j)); // 子串压栈
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
