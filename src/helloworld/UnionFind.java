package helloworld;

public class UnionFind {
    int n;
    int[] pre;

    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0) return 0;
        n = M.length;
        pre = new int[n];
        init();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (pre[i] == i) ans++;
        }
        return ans;
    }

    public void init() {
        for (int i = 0; i < n; i++) pre[i] = i;
    }

    public void union(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        if (fx != fy) pre[fx] = fy;
    }

    public int find(int x) {
        if (x == pre[x]) return x;
        return pre[x] = find(pre[x]); // 路径压缩
    }
}
