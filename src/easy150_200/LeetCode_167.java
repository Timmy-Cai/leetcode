package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeetCode_167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                }
            }
        }
        return null;
    }

    @Test
    public void testCode() {
        int[] numbers = {2, 7, 11, 15};
        int[] result = {1, 2};
        assertArrayEquals(twoSum(numbers, 9), result);
    }
}
