package jianzhi.medium50_75;

public class JIANZHI_65 {
    public int sumNums(int n) {
        int ans = n;
        boolean b = (ans > 0) && ((ans += sumNums(n - 1)) > 0); // 短路
        return ans;
    }
}
