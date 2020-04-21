package helloworld;

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
        if (!map.containsKey(key)) return -1;
        list.remove((Integer) key);
        list.addFirst(key); // 最近使用
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { // 存在，删除旧节点
            list.remove((Integer) key);
        } else if (map.size() == capacity) { // 已满，删除最后一个节点
            map.remove(list.getLast());
            list.removeLast();
        }
        map.put(key, value);
        list.addFirst(key); // 最近使用
    }
}
