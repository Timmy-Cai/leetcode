package jianzhi.easy50_75;

public class JIANZHI_66 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] ans = new int[a.length];
        int left = 1; // 累乘左边
        for (int i = 0; i < a.length; i++) {
            ans[i] = left;
            left *= a[i];
        }
        int right = 1; // 累乘右边
        for (int i = a.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= a[i];
        }
        return ans;
    }
}
