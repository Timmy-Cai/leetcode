package easy100_150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_122 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i] - prices[i - 1];
            if (p > 0) profit += p;
        }
        return profit;
    }

    @Test
    public void testCode() {
        int[] p1 = {7, 1, 5, 3, 6, 4};
        assertEquals(maxProfit(p1), 7);
        int[] p2 = {1, 2, 3, 4, 5};
        assertEquals(maxProfit(p2), 4);
        int[] p3 = {7, 6, 4, 3, 1};
        assertEquals(maxProfit(p3), 0);
    }
}
