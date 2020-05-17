package netease5_16;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- != 0) {
            int n = in.nextInt(); // 行
            int m = in.nextInt(); // 列
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    map[i][j] = in.nextLine();
                String line = in.next();
//                }
            }
            System.out.println("-1 -1 -1 -1");
        }
    }
}