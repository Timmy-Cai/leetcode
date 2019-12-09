package easy150_200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode_160 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = (p == null) ? headB : p.next;
            q = (q == null) ? headA : q.next;
        }
        return p;
    }

    @Test
    public void testCode() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;
        assertEquals(getIntersectionNode(a1, b1), c1);

        ListNode aa1 = new ListNode(2);
        ListNode aa2 = new ListNode(6);
        ListNode aa3 = new ListNode(4);
        ListNode bb1 = new ListNode(1);
        ListNode bb2 = new ListNode(5);
        aa1.next = aa2;
        aa2.next = aa3;
        bb1.next = bb2;
        assertEquals(getIntersectionNode(aa1, bb1), null);
    }
}
