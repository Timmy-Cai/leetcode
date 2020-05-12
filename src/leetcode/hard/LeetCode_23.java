package leetcode.hard;

import common.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>((o1, o2) -> {
            return o1.val - o2.val;
        });
        for (ListNode list : lists) {
            if (list != null)
                queue.add(list);
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!queue.isEmpty()) {
            ListNode tmp = queue.poll();
            cur.next = tmp;
            cur = cur.next;
            if (tmp.next != null)
                queue.add(tmp.next);
        }
        return dummy.next;
    }
}
