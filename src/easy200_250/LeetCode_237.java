package easy200_250;

import org.junit.Test;

public class LeetCode_237 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    @Test
    public void testCode() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        deleteNode(head.next);
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
}
