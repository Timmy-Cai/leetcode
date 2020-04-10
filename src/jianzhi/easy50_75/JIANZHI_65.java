package jianzhi.easy50_75;

public class JIANZHI_65 {
    public int add(int a, int b) {
        while (b != 0) {
            int sum = a ^ b; // 求和
            int carry = (a & b) << 1; // 进位
            a = sum;
            b = carry;
        }
        return a;
    }
}
