package leetcode.medium350_999;

import java.util.HashMap;
import java.util.List;

public class LeetCode_399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, Integer> hash = new HashMap<>();
        int max = 0; // 不同字符数量
        for (List<String> equation : equations) {
            String c1 = equation.get(0);
            String c2 = equation.get(1);
            if (!hash.containsKey(c1)) hash.put(c1, max++);
            if (!hash.containsKey(c2)) hash.put(c2, max++);
        }
        double[][] map = new double[max][max];
        for (int i = 0; i < values.length; i++) {
            int n1 = hash.get(equations.get(i).get(0));
            int n2 = hash.get(equations.get(i).get(1));
            map[n1][n2] = values[i];
            map[n2][n1] = 1.0 / values[i];
        }
        // Floyd 多源
        for (int k = 0; k < max; k++) {
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < max; j++) {
                    if (i != j && map[i][j] == 0 && map[i][k] != 0 && map[k][j] != 0) {
                        map[i][j] = map[i][k] * map[k][j];
                    }
                }
            }
        }
        double[] ans = new double[queries.size()];
        int index = 0;
        for (List<String> query : queries) {
            String c1 = query.get(0);
            String c2 = query.get(1);
            if (!hash.containsKey(c1) || !hash.containsKey(c2)) {
                ans[index++] = -1;
                continue;
            }
            int n1 = hash.get(c1);
            int n2 = hash.get(c2);
            if (n1 == n2) ans[index++] = 1;
            else if (map[n1][n2] == 0) ans[index++] = -1;
            else ans[index++] = map[n1][n2];
        }
        return ans;
    }
}
