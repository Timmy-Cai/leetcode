package helloworld.sort;

import java.util.Arrays;

public class TopK {
    public static int partition(int[] arr, int low, int high) {
        if (low >= high) return -1;
        int i = low, j = high, key = arr[low]; // 选择第一个数为key
        while (i < j) {
            while (i < j && arr[j] >= key) j--; // 从右往左找第一个小于key的值
            if (i < j) arr[i++] = arr[j];
            while (i < j && arr[i] <= key) i++; // 从左往右找第一个大于key的值
            if (i < j) arr[j--] = arr[i];
        }
        arr[i] = key; // i == j
        return i;
    }

    public static int[] find1(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int index = partition(arr, low, high);
            if (index > k) high = index - 1;
            if (index < k) low = index + 1;
            if (index == k) break;
        }
        return Arrays.copyOf(arr, k);
    }

    public static int find2(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int index = partition(arr, low, high);
            if (index > k) high = index - 1;
            if (index < k) low = index + 1;
            if (index == k) break;
        }
        return arr[k];
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int k = 3;

        // 最小的k个数
        int[] result = find1(nums, k);
        for (int num : result) System.out.print(num + " ");

        // 数组中的第k个最大元素
        System.out.println();
        int result2 = find2(nums, nums.length - k); // 第k大就是第len-k小
        System.out.print(result2);
    }
}
