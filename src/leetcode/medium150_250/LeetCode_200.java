package leetcode.medium150_250;

public class LeetCode_200 {
    private int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int m, n;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n) return; // 越界
        if (grid[x][y] == '0') return; // 不符合条件
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) {
            int xx = x + dir[i][0];
            int yy = y + dir[i][1];
            dfs(grid, xx, yy);
        }
    }
}
