package helloworld.ds;

import java.util.HashMap;
import java.util.LinkedList;

public class LRU {
    private HashMap<Integer, Integer> map;
    private LinkedList<Integer> list;
    private int capacity;

    public LRU(int capacity) {
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1; // 不存在
        put(key, map.get(key));
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { // 存在
            list.remove((Integer) key);
        } else {
            if (map.size() == capacity) { // 已满
                map.remove(list.removeLast());
            }
        }
        map.put(key, value);
        list.addFirst(key); // 最近使用
    }
}
