package leetcode.easy100_150;

public class LeetCode_122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i] - prices[i - 1];
            if (p > 0) profit += p;
        }
        return profit;
    }
}
