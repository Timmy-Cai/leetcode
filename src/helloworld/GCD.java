package helloworld;

public class GCD {
    // 最大公约数 Greatest Common Divisor
    public static int gcd(int m, int n) {
        while (n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m;
    }

    // 最小公倍数 Least Common Multiple
    public static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }

    public static void main(Encode[] args) {
        int m = 6, n = 24;
        System.out.println("最大公约数：" + gcd(m, n));
        System.out.println("最小公倍数：" + lcm(m, n));
    }
}
