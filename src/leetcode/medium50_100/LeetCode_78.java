package leetcode.medium50_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_78 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums != null && nums.length != 0)
            track(nums, 0, new LinkedList<>());
        return list;
    }

    public void track(int[] nums, int cur, LinkedList<Integer> tmpList) {
        list.add(new LinkedList<>(tmpList));
        for (int i = cur; i < nums.length; i++) {
            tmpList.add(nums[i]);
            track(nums, i + 1, tmpList);
            tmpList.removeLast();
        }
    }
}
