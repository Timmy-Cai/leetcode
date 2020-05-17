package helloworld.sort;

/**
 * https://www.runoob.com/w3cnote/sort-algorithm-summary.html
 * 算法   最好    平均     最坏
 * 冒泡   n       n2      n2
 * 选择   n2      n2      n2
 * 插入   n       n2      n2
 * 归并   nlogn   nlogn   nlogn
 * 快排   nlogn   nlogn   n2
 * 堆排   nlogn   nlogn   nlogn
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int index = partition(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);
    }

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

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) System.out.print(num + " ");

        System.out.println();
        arr = new int[]{5, 5, 4, 4, 3, 3, 2, 2, 1, 1};
        quickSort2(arr, 0, arr.length - 1);
        for (int num : arr) System.out.print(num + " ");
    }

    // 优化：
    // 一、小数组使用插入排序
    // 二、三数取中
    // 三、三向切分（重复数组）
    public static void quickSort2(int[] arr, int l, int r) {
        if (l >= r) return;
        int lt = l, i = l + 1, gt = r, key = arr[l];
        while (i <= gt) {
            if (arr[i] < key) {
                swap(arr, lt++, i++); // lt表示左侧小于key
            } else if (arr[i] > key) {
                swap(arr, i, gt--); // gt表示右侧大于key
            } else {
                i++; // i是当前比较的下标
            }
        }
        quickSort2(arr, l, lt - 1);
        quickSort2(arr, gt + 1, r);
    }

    private static void swap(int[] a, int first, int second) {
        int tmp = a[first];
        a[first] = a[second];
        a[second] = tmp;
    }
}
