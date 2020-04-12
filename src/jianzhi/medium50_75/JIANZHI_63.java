package jianzhi.medium50_75;

public class JIANZHI_63 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int p : prices) {
            if (p < minPrice)
                minPrice = p;
            if (p - minPrice > maxProfit)
                maxProfit = p - minPrice;
        }
        return maxProfit;
    }
}
