package leetcode.medium50_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        int size = matrix[0].length * matrix.length;
        while (left <= right && up <= down) {
            // left to right
            for (int i = left; i <= right; i++) list.add(matrix[up][i]);
            if (list.size() == size) break;
            up++;
            // top to bottom
            for (int i = up; i <= down; i++) list.add(matrix[i][right]);
            if (list.size() == size) break;
            right--;
            // right to left
            for (int i = right; i >= left; i--) list.add(matrix[down][i]);
            if (list.size() == size) break;
            down--;
            // bottom to top
            for (int i = down; i >= up; i--) list.add(matrix[i][left]);
            if (list.size() == size) break;
            left++;
        }
        return list;
    }
}
