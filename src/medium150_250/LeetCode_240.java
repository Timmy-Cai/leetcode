package medium150_250;

public class LeetCode_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = m > 0 ? matrix[0].length : 0;
        // 从左下角开始扫描
        int row = m - 1;
        int col = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] > target) row--;
            else if (matrix[row][col] < target) col++;
            else return true;
        }
        return false;
    }
}
