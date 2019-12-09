package easy50_100;

import org.junit.Test;

public class LeetCode_83 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    @Test
    public void testCode() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        ListNode node1 = deleteDuplicates(l1);
        while (node1 != null) {
            System.out.println(node1.val);
            node1 = node1.next;
        }

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(3);
        ListNode node2 = deleteDuplicates(l2);
        while (node2 != null) {
            System.out.println(node2.val);
            node2 = node2.next;
        }
    }
}
