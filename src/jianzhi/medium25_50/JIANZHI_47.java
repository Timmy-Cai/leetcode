package jianzhi.medium25_50;

public class JIANZHI_47 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue; // 原点
                if (i == 0) grid[i][j] += grid[i][j - 1]; // 只能向右
                else if (j == 0) grid[i][j] += grid[i - 1][j]; // 只能向下
                else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]); // 可以向右或向下
            }
        }
        return grid[m - 1][n - 1];
    }
}
