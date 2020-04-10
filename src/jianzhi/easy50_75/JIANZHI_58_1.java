package jianzhi.easy50_75;

public class JIANZHI_58_1 {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue;
            if (i == 0) sb.append(strs[i].trim());
            else sb.append(strs[i].trim()).append(" ");
        }
        return sb.toString();
    }
}
