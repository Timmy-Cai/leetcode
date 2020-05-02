package helloworld.sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            // 先递归分解数组
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            // 再合并数组
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] tmp = new int[arr.length];
        int i = start, j = mid + 1, k = start;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= end) tmp[k++] = arr[j++];
        for (int ii = start; ii <= end; ii++) arr[ii] = tmp[ii];
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        mergeSort(arr, 0, arr.length - 1);
        for (int value : arr) System.out.print(value + " ");
    }
}
