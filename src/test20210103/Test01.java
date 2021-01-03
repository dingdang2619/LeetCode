package test20210103;

import JZOffer.ListNode;

public class Test01 {
    public int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        while(temp != null){
            head = head.next;
            temp = temp.next;
        }
        return head.val;
    }
}
