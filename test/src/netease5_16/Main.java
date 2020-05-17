package netease5_16;

import java.util.*;

class Wu {
    int sec;
    int speed;

    public Wu(int sec, int speed) {
        this.sec = sec;
        this.speed = speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<List<Wu>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int m = in.nextInt();
            List<Wu> wus = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                wus.add(new Wu(in.nextInt(), in.nextInt()));
            }
            list.add(wus);
        }
        int Q = in.nextInt();
        while (Q-- != 0) {
            int q = in.nextInt(); // 比赛时长
            float maxLen = Integer.MIN_VALUE;
            int id = 0;
            for (int i = 1; i <= N; i++) {
                // 3 0 50 1 1 10000 2
                // 1 0 11
                // 2 0 20 10 1
                int len = 0, cur = 0; // cur为当前状态
                int a = 0, b = 0;
                // 遍历比赛时间 从0开始
                for (int k = 0; k < q; k++) {
                    // 不需要切换速度 或者 无法切换速度
                    if (cur != list.get(i - 1).size()) {
                        // 判断是否需要改变速度
                        a = list.get(i - 1).get(cur).sec;
                        if (k == a) {
                            b = list.get(i - 1).get(cur++).speed;
                        }
                    }
                    len += b;
                }
                if (len > maxLen) {
                    maxLen = len;
                    id = i;
                }
            }
            System.out.println(id);
        }
    }
}