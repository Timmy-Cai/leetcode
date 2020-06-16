package helloworld.sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        // 先递归分解数组
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        // 再合并数组
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= right) tmp[k++] = arr[j++];
        for (int ii = 0; ii < tmp.length; ii++) arr[left + ii] = tmp[ii];
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        mergeSort(arr, 0, arr.length - 1);
        for (int n : arr) System.out.print(n + " ");
    }
}
