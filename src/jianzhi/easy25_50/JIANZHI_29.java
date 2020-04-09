package jianzhi.easy25_50;

public class JIANZHI_29 {
    public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        int left = 0, right = n - 1, up = 0, down = m - 1, cur = 0, size = m * n;
        int[] ans = new int[size];
        while (left <= right && up <= down) {
            // 从左到右
            for (int i = left; i <= right; i++) ans[cur++] = matrix[up][i];
            if (cur == size) break;
            up++;
            // 从上到下
            for (int i = up; i <= down; i++) ans[cur++] = matrix[i][right];
            if (cur == size) break;
            right--;
            // 从右到左
            for (int i = right; i >= left; i--) ans[cur++] = matrix[down][i];
            if (cur == size) break;
            down--;
            // 从下到上
            for (int i = down; i >= up; i--) ans[cur++] = matrix[i][left];
            if (cur == size) break;
            left++;
        }
        return ans;
    }
}
