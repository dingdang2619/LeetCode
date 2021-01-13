package test20210112;

import JZOffer.ListNode;

public class Test02 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
