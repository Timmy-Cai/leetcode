package jianzhi.easy50_75;

import common.ListNode;

public class JIANZHI_52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alen = 0, blen = 0;
        ListNode tmpA = headA;
        while (tmpA != null) {
            tmpA = tmpA.next;
            alen++;
        }
        ListNode tmpB = headB;
        while (tmpB != null) {
            tmpB = tmpB.next;
            blen++;
        }
        if (alen >= blen) {
            tmpA = headA;
            tmpB = headB;
        } else {
            tmpA = headB;
            tmpB = headA;
        }
        int sub = Math.abs(alen - blen);
        while (sub-- != 0) tmpA = tmpA.next;
        while (tmpA != tmpB) {
            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }
        return tmpA;
    }
}
