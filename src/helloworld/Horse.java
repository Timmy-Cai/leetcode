package helloworld;

public class Horse {
    private static int m, n, x, y, ans = 0;
    private static boolean[][] map;
    private static int[][] step = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}}; // 8个方向

    public static void dfs(int x, int y, int cur) {
        if (x < 0 || x >= m || y < 0 || y >= n) return;
        if (map[x][y]) return;
        if (cur == m * n) {
            ans++;
            return;
        }
        for (int i = 0; i < 8; i++) {
            map[x][y] = true;
            dfs(x + step[i][0], y + step[i][1], cur + 1);
            map[x][y] = false;
        }
    }

    public static void main(String[] args) {
        m = 5;
        n = 4;
        x = 0;
        y = 0;
        map = new boolean[m][n];
        dfs(x, y, 1);
        System.out.println(ans);
    }
}
