package helloworld;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l, j = r, key = arr[l]; // 选择第一个数为key
        while (i < j) {
            while (i < j && arr[j] >= key) j--; // 从右往左找第一个小于key的值
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            while (i < j && arr[i] < key) i++; // 从左往右找第一个大于key的值
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        // i == j
        arr[i] = key;
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(arr, 0, arr.length - 1);
        for (int value : arr) System.out.print(value + " ");
    }
}
