package medium50_100;

public class LeetCode_59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = n - 1;
        int num = 0;
        int size = n * n;
        while (num < size) {
            // left to right
            for (int i = left; i <= right; i++) ans[up][i] = ++num;
            up++;
            // up to down
            for (int i = up; i <= down; i++) ans[i][right] = ++num;
            right--;
            // right to left
            for (int i = right; i >= left; i--) ans[down][i] = ++num;
            down--;
            // down to up
            for (int i = down; i >= up; i--) ans[i][left] = ++num;
            left++;
        }
        return ans;
    }
}
