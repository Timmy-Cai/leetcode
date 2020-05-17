package netease5_16;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        while (Q-- != 0) {
            int N = in.nextInt(); // 行
            int M = in.nextInt(); // 列
            int X = in.nextInt(); // 初始位置x
            int Y = in.nextInt(); // 初始位置y
            int W = in.nextInt(); // 方向 0左上 1右上 2右下 3左下
            int T = in.nextInt(); // 离开时间
            int ans = 0;
            // 模拟碰撞
            // 6 5
            // 4 3 0 42 => 35
            for (int i = 0; i < T; i++) {
                // 左上
                if (W == 0) {
                    X--;
                    Y--;
                    // 墙壁0左上 1右上 2右下 3左下
                    if (X == 2 && Y == 2) {
                        ans += 2;
                        W = 2;
                    } else if (X == 2) {
                        ans++;
                        W = 3;
                    } else if (Y == 2) {
                        ans++;
                        W = 1;
                    }
                    //System.out.println("左上"+ans);
                }
                // 右上
                else if (W == 1) {
                    X--;
                    Y++;
                    // 墙壁0左上 1右上 2右下 3左下
                    if (X == 2 && Y == M - 1) {
                        ans += 2;
                        W = 3;
                    } else if (X == 2) {
                        ans++;
                        W = 2;
                    } else if (Y == M - 1) {
                        ans++;
                        W = 0;
                    }
                    //System.out.println("右上"+ans);
                }
                // 右下
                else if (W == 2) {
                    X++;
                    Y++;
                    // 墙壁0左上 1右上 2右下 3左下
                    if (X == N - 1 && Y == M - 1) {
                        ans += 2;
                        W = 0;
                    } else if (X == N - 1) {
                        ans++;
                        W = 1;
                    } else if (Y == M - 1) {
                        ans++;
                        W = 3;
                    }
                    //System.out.println("右下"+ans);
                }
                // 左下
                else if (W == 3) {
                    X++;
                    Y--;
                    // 墙壁0左上 1右上 2右下 3左下
                    if (X == N - 1 && Y == 2) {
                        ans += 2;
                        W = 1;
                    } else if (X == N - 1) {
                        ans++;
                        W = 0;
                    } else if (Y == 2) {
                        ans++;
                        W = 2;
                    }
                    //System.out.println("左下"+ans);
                }
            }
            System.out.println(ans);
        }
    }
}