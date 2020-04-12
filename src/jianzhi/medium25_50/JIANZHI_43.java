package jianzhi.medium25_50;

public class JIANZHI_43 {
    public int countDigitOne(int n) {
        return f(n);
    }

    public int f(int n) {
        if (n <= 0) return 0;
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length() - 1);
        int last = n - high * pow;
        if (high == 1) {
            // n=1234 => high=1, pow=1000, last=234
            // [1,999] => f(pow-1)
            // [1000,1234]
            // 千分位是1的个数 => last+1
            // 其他位是1的个数 => f(last)
            return f(pow - 1) + last + 1 + f(last);
        } else {
            // n=3234 => high=3, pow=1000, last=234
            // [1,999] => f(pow-1)
            // [1000,1999]
            // 千分位是1的个数 => pow
            // 其他位是1的个数 => f(pow-1)
            // [2000,2999] => f(pow-1)
            // [3000,3234] => f(last)
            return high * f(pow - 1) + f(last) + pow;
        }
    }
}
