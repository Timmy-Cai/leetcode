package helloworld.sort;

public class Sort_N2 {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }

    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int current = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && current < arr[preIndex]) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;
            }
            gap /= 2;
        }
    }

    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        bubbleSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        selectSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        insertSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        shellSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}
