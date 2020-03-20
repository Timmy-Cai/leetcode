package medium50_100;

public class LeetCode_79 {
    boolean[][] vis = new boolean[200][200];
    int[][] direction = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    int m, n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        // 遍历所有起点
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (track(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean track(char[][] board, String word, int x, int y, int cur) {
        // 匹配不成功
        if (word.charAt(cur) != board[x][y]) return false;

        // 匹配成功
        if (word.length() == cur + 1) return true;

        // 上下左右
        vis[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + direction[i][0];
            int yy = y + direction[i][1];
            if (check(xx, yy) && track(board, word, xx, yy, cur + 1))
                return true;
        }
        vis[x][y] = false;
        return false;
    }

    public boolean check(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n && !vis[x][y];
    }
}
