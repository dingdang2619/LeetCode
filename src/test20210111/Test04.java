package test20210111;

import JZOffer.ListNode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 *
 * 输入：head = []
 * 输出：[]
 *
 * 输入：head = [1]
 * 输出：[1]

 */

public class Test04 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(swapPairs(head));
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode before = head;
        ListNode after = head.next;
        ListNode dummy = new ListNode();
        dummy.next = after;
        before.next = after.next;
        after.next = before;


        return dummy.next;
    }
//    public static ListNode swapPairs(ListNode head) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode temp = dummy;
//        while (temp.next != null && temp.next.next != null) {
//            ListNode before = temp.next;
//            ListNode after = temp.next.next;
//
//            temp.next = after;
//            before.next = after.next;
//            after.next = before;
//            temp = before;
//        }
//        return dummy.next;
//    }
}
