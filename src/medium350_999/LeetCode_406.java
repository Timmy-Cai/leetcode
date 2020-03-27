package medium350_999;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode_406 {
    public int[][] reconstructQueue(int[][] people) {
        // [(h1, k1), ..., (hn, kn)]
        // 先根据h降序排序，再根据k升序排序
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        // 插入位置
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
