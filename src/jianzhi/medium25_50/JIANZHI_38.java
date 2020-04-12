package jianzhi.medium25_50;

import java.util.HashSet;
import java.util.Set;

public class JIANZHI_38 {
    Set<String> set = new HashSet<>();
    boolean[] vis;
    char[] c;

    public String[] permutation(String s) {
        vis = new boolean[s.length()];
        c = s.toCharArray();
        helper("");
        return set.toArray(new String[set.size()]);
    }

    public void helper(String tmp) {
        if (tmp.length() == c.length) {
            set.add(tmp);
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (vis[i]) continue;
            vis[i] = true;
            helper(tmp + c[i]);
            vis[i] = false;
        }
    }
}
