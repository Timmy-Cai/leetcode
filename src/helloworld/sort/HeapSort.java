package helloworld.sort;

public class HeapSort {
    public static void heapSort(int[] arr, int n) {
        // 创建最大堆（N/2次向下调整）
        for (int i = (n - 1) / 2; i >= 0; i--) {
            down(arr, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            // 堆顶元素为最大值，与末尾元素交换
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            // 重新调整N-1个元素为堆，继续交换堆顶和末尾，如此反复
            down(arr, 0, i);
        }
    }

    public static void down(int[] arr, int parent, int n) {
        int tmp = arr[parent];
        int lChild = 2 * parent + 1;
        while (lChild < n) {
            int rChild = lChild + 1;
            if (rChild < n && arr[lChild] < arr[rChild]) lChild++;

            if (tmp >= arr[lChild]) break;

            arr[parent] = arr[lChild];

            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = tmp;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        heapSort(arr, arr.length);
        for (int n : arr) System.out.print(n + " ");
    }
}
