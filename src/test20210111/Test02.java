package test20210111;

import JZOffer.ListNode;

public class Test02 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode cur = listNode;
        while (l1 != null && l2 != null) {
            cur.next = new ListNode();
            cur = cur.next;
            if (l1.val > l2.val) {
                cur.val = l2.val;
                l2 = l2.next;
            } else {
                cur.val = l1.val;
                l1 = l1.next;
            }

        }
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return listNode.next;
    }
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode listNode = new ListNode();
//        ListNode temp = listNode;
//        while (l1 != null && l2 != null) {
//            if (l1.val > l2.val) {
//                temp.next = l2;
//                l2 = l2.next;
//            }else{
//                temp.next = l1;
//                l1 = l1.next;
//            }
//            temp = temp.next;
//        }
//
//        if(l1 == null){
//            temp.next = l2;
//        }else{
//            temp.next = l1;
//        }
//        return listNode.next;
//    }
}
