package jianzhi.medium1_25;

public class JIANZHI_12 {
    char[][] board;
    char[] word;
    int m, n;
    int[][] step = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word.toCharArray();
        this.m = board.length;
        this.n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (helper(i, j, 0))
                    return true;
        return false;
    }

    public boolean helper(int i, int j, int cur) {
        if (i < 0 || i >= m || j < 0 || j >= n) return false;
        if (board[i][j] != word[cur]) return false;
        if (cur == word.length - 1) return true;
        char tmp = board[i][j];
        board[i][j] = '*';
        for (int k = 0; k < 4; k++) {
            if (helper(i + step[k][0], j + step[k][1], cur + 1)) {
                return true;
            }
        }
        board[i][j] = tmp;
        return false;
    }
}
