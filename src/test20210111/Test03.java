package test20210111;

import JZOffer.ListNode;

public class Test03 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
