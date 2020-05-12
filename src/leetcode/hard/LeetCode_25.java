package leetcode.hard;

import common.ListNode;

public class LeetCode_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k < 2) return null;
        ListNode cur = head;
        int cnt = 0;
        while (cur != null && cnt < k) {
            cur = cur.next;
            cnt++;
        }
        if (cnt == k) {
            cur = reverseKGroup(cur, k);
            while (cnt-- != 0) {
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                head = tmp;
            }
            return cur;
        }
        return head;
    }
}
