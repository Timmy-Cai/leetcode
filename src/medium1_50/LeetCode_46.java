package medium1_50;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_46 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums != null && nums.length != 0)
            track(nums, new ArrayList<>());
        return list;
    }

    public void track(int[] nums, ArrayList<Integer> tmpList) {
        if (tmpList.size() == nums.length) {
            list.add(new ArrayList<>(tmpList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmpList.contains(nums[i])) continue;
            tmpList.add(nums[i]);
            track(nums, tmpList);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}
