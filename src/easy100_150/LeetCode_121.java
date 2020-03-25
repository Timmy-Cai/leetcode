package easy100_150;

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
}
