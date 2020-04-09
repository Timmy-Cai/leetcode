package jianzhi.easy1_25;

public class JIANZHI_10_1 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int first = 0, second = 1, third = 0;
        for (int i = 2; i <= n; i++) {
            third = (first + second) % 1000000007;
            first = second;
            second = third;
        }
        return third;
    }
}
