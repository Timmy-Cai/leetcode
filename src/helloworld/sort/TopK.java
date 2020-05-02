package helloworld.sort;

public class TopK {
    public static int quickSort(int[] arr, int l, int r) {
        if (l >= r) return -1;
        int i = l, j = r, key = arr[l]; // 选择第一个数为key
        while (i < j) {
            while (i < j && arr[j] >= key) j--; // 从右往左找第一个小于key的值
            if (i < j) arr[i++] = arr[j];
            while (i < j && arr[i] <= key) i++; // 从左往右找第一个大于key的值
            if (i < j) arr[j--] = arr[i];
        }
        // i == j
        arr[i] = key;
        // quickSort(arr, l, i - 1); // 注释
        // quickSort(arr, i + 1, r); // 注释
        return i;
    }

    public static void topk(int[] arr, int left, int right, int k) {
        if (left < right) {
            int index = quickSort(arr, left, right);
            if (index > k) topk(arr, left, index - 1, k); // 大了
            else if (index < k) topk(arr, index + 1, right, k); // 小了
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int k = 3;
        topk(arr, 0, arr.length - 1, k);
        for (int value : arr) System.out.print(value + " ");
    }
}
