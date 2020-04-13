package jianzhi.medium1_25;

public class JIANZHI_16 {
    public double myPow(double x, int n) {
        double ans = 1;
        int exp = n;
        // n为偶数，则 x^n = x^{n/2} ∗ x^{n/2}
        // n为奇数，则 x^n = x^{n/2} ∗ x^{n/2} ∗ x
        while (exp != 0) {
            if (exp % 2 != 0) {
                ans = ans * x;
            }
            x *= x;
            exp /= 2;
        }
        return n > 0 ? ans : 1 / ans;
    }
}
