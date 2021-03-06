package jianzhi.easy50_75;

import java.util.ArrayList;
import java.util.List;

public class JIANZHI_62 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n; // -1当前位置删除
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }
}
