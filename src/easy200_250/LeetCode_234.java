package easy200_250;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_234 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        // 快慢链表
        while (fast != null) {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : null;
        }
        // 翻转slow后面部分
        ListNode prev = reverse(slow);
        // 比较
        while (head != null && prev != null) {
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    @Test
    public void testCode() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        assertEquals(isPalindrome(node1), false);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(2);
        node2.next.next.next = new ListNode(1);
        assertEquals(isPalindrome(node2), true);
    }
}
