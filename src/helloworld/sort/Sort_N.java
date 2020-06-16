package helloworld.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_N {
    public static void countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        int[] count = new int[max - min + 1];
        for (int n : arr) {
            count[n - min]++;
        }
        int index = 0; // countSort
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min; // countSort
            }
        }
    }

    public static void bucketSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        int bucketCount = (max - min) / arr.length + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) buckets.add(new ArrayList<>());
        for (int n : arr) {
            int bucketIndex = (n - min) / arr.length;
            buckets.get(bucketIndex).add(n);
        }
        int index = 0; // bucketSort
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets.get(i));
            for (int j = 0; j < buckets.get(i).size(); j++) {
                arr[index++] = buckets.get(i).get(j); // bucketSort
            }
        }
    }

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            max = Math.max(max, n);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) buckets.add(new ArrayList<>());
        for (int exp = 1; max / exp > 0; exp *= 10) { // LSD 最低位优先
            for (int n : arr) {
                int bucketIndex = (n / exp) % 10;
                buckets.get(bucketIndex).add(n);
            }
            int index = 0; // radixSort
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < buckets.get(j).size(); k++) {
                    arr[index++] = buckets.get(j).get(k); // radixSort
                }
                buckets.get(j).clear();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        countSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        bucketSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        arr = new int[]{4, 4, 5, 2, 8, 1, 1997, 11, 27, 1015};
        radixSort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}
