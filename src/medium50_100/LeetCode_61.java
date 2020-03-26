package medium50_100;

import common.ListNode;

public class LeetCode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode tmp = head;
        int len = 1;
        // 连接首尾
        while (tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        tmp.next = head;
        k = len - k % len;
        // 断开节点
        while (k-- != 0) {
            tmp = tmp.next;
        }
        head = tmp.next;
        tmp.next = null;
        return head;
    }
}
