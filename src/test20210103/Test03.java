package test20210103;

import JZOffer.ListNode;

public class Test03 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);
//        ListNode l2 = new ListNode(4);
//        l2.next = new ListNode(5);
//        l2.next.next = new ListNode(6);

//        ListNode result = mergeTwoLists(l1, l2);
        ListNode result = partition(l1, 4);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode sRes = small;
        ListNode bRes = big;
        while (head != null) {
            if (head.val >= x) {
                bRes.next = new ListNode(head.val);
                bRes = bRes.next;
            } else {
                sRes.next = new ListNode(head.val);
                sRes = sRes.next;
            }
            head = head.next;
        }

        ListNode temp = small;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = big.next;
        return small.next;
    }
}
