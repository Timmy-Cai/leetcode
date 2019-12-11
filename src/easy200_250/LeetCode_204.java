package easy200_250;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_204 {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    @Test
    public void testCode() {
        assertEquals(countPrimes(10), 4); // 2 3 5 7
    }
}
