package helloworld;

import java.util.Arrays;

public class Prime {
    public static void prime(int n) {
        boolean isPrime;
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }

    public static void prime2(int n) {
        boolean[] num = new boolean[n + 1];
        Arrays.fill(num, true);
        num[0] = false;
        num[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; i * j <= n; j++) {
                num[i * j] = false;
            }
        }
        for (int i = 2; i <= n; i++)
            if (num[i]) System.out.print(i + " ");
    }

    public static void main(Encode[] args) {
        prime(100);
        System.out.println();
        prime2(100);
    }
}
