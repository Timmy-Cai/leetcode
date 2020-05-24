package helloworld;

public class Sqrt {
    // 二分查找
    public static int binarySearch(int[] arr, int target) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < target) l = mid + 1; // 小了
            else if (arr[mid] > target) h = mid - 1; // 大了
            else return mid;
        }
        return -1;
    }

    // N平方根，误差小数点后6位
    public static float sqrt(float n) {
        float low = 0, high = n, mid = 0;
        while (Math.abs(high - low) >= 1e-6) {
            mid = (low + high) / 2;
            if (mid * mid < n) low = mid; // 小了
            else high = mid; // 大了
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println(binarySearch(arr, 11));
        System.out.println(sqrt(10));
    }
}
