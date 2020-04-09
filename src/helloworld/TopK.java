package helloworld;

public class TopK {
    public static int quickSort(int[] arr, int l, int r) {
        if (l >= r) return -1;
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
        // quickSort(arr, l, i - 1); // 注释
        // quickSort(arr, i + 1, r); // 注释
        return i;
    }

    public static int topK(int[] arr, int l, int r, int k) {
        k = r - k + 1;
        while (l < r) {
            int index = quickSort(arr, l, r);
            if (index > k) {
                r = index - 1;
            } else if (index < k) {
                l = index + 1;
            } else {
                return arr[k];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int num = topK(arr, 0, arr.length - 1, 1);
        System.out.print(num);
    }
}
