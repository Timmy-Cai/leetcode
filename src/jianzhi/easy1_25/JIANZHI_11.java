package jianzhi.easy1_25;

public class JIANZHI_11 {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (numbers[mid] < numbers[j])
                j = mid; // min在左区间 [2, 0, 1, 2, 2]
            else if (numbers[mid] > numbers[j])
                i = mid + 1; // min在右区间 [2, 2, 2, 0, 1]
            else
                j--; // 去重
        }
        return numbers[i]; // i == j
    }
}
