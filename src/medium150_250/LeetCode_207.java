package medium150_250;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ins = new int[numCourses]; // 入度表
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new LinkedList<>());
        // [1, 0] 0 -> 1
        for (int[] cp : prerequisites) {
            ins[cp[0]]++;
            adj.get(cp[1]).add(cp[0]);
        }
        // 节点入队
        for (int i = 0; i < numCourses; i++)
            if (ins[i] == 0)
                queue.add(i);
        // 拓扑排序
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            numCourses--; // 若为有向无环图，所有节点一定都入队并出队过
            for (int i : adj.get(cur))
                if (--ins[i] == 0)
                    queue.add(i);
        }
        return numCourses == 0;
    }
}
