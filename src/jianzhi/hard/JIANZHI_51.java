package jianzhi.hard;

public class JIANZHI_51 {
    int ans = 0;

    public int reversePairs(int[] nums) {
        if (nums.length != 0) mergeSort(nums, 0, nums.length - 1);
        return ans;
    }

    public void mergeSort(int[] nums, int left, int right) {
        if (left == right) return;
        // 先递归分解数组
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        // 再合并数组
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
                ans += j - (mid + 1); // 计算逆序对
            } else {
                tmp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = nums[i++];
            ans += j - (mid + 1); // 计算逆序对
        }
        while (j <= right) {
            tmp[k++] = nums[j++];
        }
        for (int ii = 0; ii < tmp.length; ii++) nums[left + ii] = tmp[ii];
    }
}
