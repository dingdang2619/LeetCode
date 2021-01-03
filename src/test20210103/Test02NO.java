package test20210103;

import JZOffer.ListNode;

/**
 * 注意：可能k值大于ListNode的长度 不能单纯的右移
 */
public class Test02NO {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
//        l1.next.next.next = new ListNode(5);
//        l1.next.next.next.next = new ListNode(6);
//        ListNode l2 = new ListNode(4);
//        l2.next = new ListNode(5);
//        l2.next.next = new ListNode(6);

//        ListNode result = mergeTwoLists(l1, l2);
        ListNode result = rotateRight(l1, 4);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        return null;
    }
}
