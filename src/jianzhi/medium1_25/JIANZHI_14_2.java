package jianzhi.medium1_25;

public class JIANZHI_14_2 {
    public int cuttingRope(int n) {
        // 3等分，乘积最大
        if (n <= 3) return n - 1;
        int a = n / 3 - 1, b = n % 3;
        int mod = 1000000007;
        long ans = 1L;
        for (int i = 0; i < a; i++)
            ans = (ans * 3) % mod;
        // if (b == 0) ans = (int) Math.pow(3, a); // 最优
        // if (b == 1) ans = (int) Math.pow(3, a - 1) * 4; // 最差；1+3拆分2+2
        // if (b == 2) ans = (int) Math.pow(3, a) * 2; // 次优
        if (b == 0) ans = (ans * 3) % mod; // 最优
        if (b == 1) ans = (ans * 4) % mod; // 最差；1+3拆分2+2
        if (b == 2) ans = (ans * 6) % mod; // 次优
        return (int) ans;
    }
}
