package easy100_150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_141 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && slow.next != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    @Test
    public void testCode() {
        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(0);
        node1.next.next.next = new ListNode(-4);
        node1.next.next.next.next = node1.next;
        assertEquals(hasCycle(node1), true);


        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = node2;
        assertEquals(hasCycle(node2), true);


        ListNode node3 = new ListNode(1);
        assertEquals(hasCycle(node3), false);
    }
}
