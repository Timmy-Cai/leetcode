package medium1_50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_39 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        track(0, candidates, target, new LinkedList<>());
        return list;
    }

    public void track(int start, int[] candidates, int target, LinkedList<Integer> tmpList) {
        if (target < 0) return;
        if (target == 0) {
            list.add(new ArrayList<>(tmpList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tmpList.add(candidates[i]);
            track(i, candidates, target - candidates[i], tmpList);
            tmpList.removeLast();
        }
    }
}
