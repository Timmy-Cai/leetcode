package easy100_150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int curPrice : prices) {
            if (curPrice < minPrice) minPrice = curPrice;
            profit = Math.max(profit, curPrice - minPrice);
        }
        return profit;
    }

    @Test
    public void testCode() {
        int[] p1 = {7, 1, 5, 3, 6, 4};
        assertEquals(maxProfit(p1), 5);
        int[] p2 = {7, 6, 4, 3, 1};
        assertEquals(maxProfit(p2), 0);
    }
}
