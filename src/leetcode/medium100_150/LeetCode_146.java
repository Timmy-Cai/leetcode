package leetcode.medium100_150;

import java.util.HashMap;
import java.util.LinkedList;

public class LeetCode_146 {

    class LRUCache {
        HashMap<Integer, Integer> map;
        LinkedList<Integer> list;
        int cap;

        public LRUCache(int capacity) {
            map = new HashMap<>();
            list = new LinkedList<>();
            cap = capacity;
        }

        public int get(int key) {
            if (!map.containsKey(key))
                return -1;
            list.remove((Integer) key); // 更新
            list.addFirst(key);
            return map.get(key);
        }

        public void put(int key, int val) {
            if (map.containsKey(key)) {
                list.remove((Integer) key); // 存在，移除旧节点
            } else if (list.size() == cap) {
                map.remove(list.getLast());
                list.removeLast(); // 满，删除最后一个节点
            }
            map.put(key, val);
            list.addFirst(key); // 添加新节点
        }
    }
}
