package leetcode.medium1_50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_46 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums != null && nums.length != 0)
            track(nums, new LinkedList<>());
        return list;
    }

    public void track(int[] nums, LinkedList<Integer> tmpList) {
        if (tmpList.size() == nums.length) {
            list.add(new LinkedList<>(tmpList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmpList.contains(nums[i])) continue;
            tmpList.add(nums[i]);
            track(nums, tmpList);
            tmpList.removeLast();
        }
    }
}
