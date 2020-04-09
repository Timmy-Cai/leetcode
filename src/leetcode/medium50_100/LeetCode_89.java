package leetcode.medium50_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int add;
        // 镜像反射
        for (int i = 0; i < n; i++) {
            add = 1 << i;
            for (int j = list.size() - 1; j >= 0; j--) {
                list.add(list.get(j) + add);
            }
        }
        return list;
    }
}
