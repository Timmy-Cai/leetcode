package helloworld;

import java.util.Random;

public class Shuffle {
    public static void shuffle(int[] nums) {
        Random random = new Random();
        for (int i = nums.length - 1; i >= 0; i--) {
            int rand = random.nextInt(i + 1);
            int tmp = nums[i];
            nums[i] = nums[rand];
            nums[rand] = tmp;
        }
    }

    public static void main(Encode[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
        shuffle(nums);
        for (int num : nums) System.out.print(num + " ");
    }
}
