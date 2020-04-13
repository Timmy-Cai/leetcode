package jianzhi.medium1_25;

public class JIANZHI_13 {
    int ans = 0;
    int m, n, k;
    boolean[][] vis;
    int[][] step = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        vis = new boolean[m][n];
        helper(0, 0);
        return ans;
    }

    public void helper(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n) return;
        if (!check(i, j)) return;
        if (vis[i][j]) return;
        vis[i][j] = true;
        ans++;
        for (int k = 0; k < 4; k++) {
            helper(i + step[k][0], j + step[k][1]);
        }
    }

    // 不能进入行坐标和列坐标的数位之和大于k的格子
    public boolean check(int i, int j) {
        int kk = 0;
        while (i != 0) {
            kk += i % 10;
            i /= 10;
        }
        while (j != 0) {
            kk += j % 10;
            j /= 10;
        }
        return kk <= k;
    }
}
