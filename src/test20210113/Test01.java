package test20210113;

import JZOffer.ListNode;

/**
 * 面试题 02.07. 链表相交
 * <p>
 * 给定两个（单向）链表，判定它们是否相交并返回交点。
 * 请注意相交的定义基于节点的引用，而不是基于节点的值。
 * 换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 */
public class Test01 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(0);
        l2.next.next = new ListNode(1);
        l2.next.next.next = new ListNode(8);
        l2.next.next.next.next = new ListNode(4);
        l2.next.next.next.next.next = new ListNode(5);
        ListNode result = getIntersectionNode(l1, l2);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != l2) {
            if (l1 == null) {
                l1 = headB;
            } else {
                l1 = l1.next;
            }

            if (l2 == null) {
                l2 = headA;
            } else {
                l2 = l2.next;
            }
        }
        return l1;
    }
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode l1 = headA;
//        ListNode l2 = headB;
//        int sizeA = 0, sizeB = 0;
//        while (l1 != null) {
//            sizeA++;
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            sizeB++;
//            l2 = l2.next;
//        }
//        l1 = headA;
//        l2 = headB;
//        if (sizeA > sizeB) {
//            for (int i = 0; i < sizeA - sizeB; i++) {
//                l1 = l1.next;
//            }
//            while (l1 != l2) {
//                if (l1 != null && l2 != null) {
//                    l1 = l1.next;
//                    l2 = l2.next;
//                } else {
//                    return null;
//                }
//            }
//            return l1;
//        } else if (sizeA < sizeB) {
//            for (int i = 0; i < sizeB - sizeA; i++) {
//                l2 = l2.next;
//            }
//            while (l1 != l2) {
//                if (l1 != null && l2 != null) {
//                    l1 = l1.next;
//                    l2 = l2.next;
//                } else {
//                    return null;
//                }
//            }
//            return l1;
//        } else {
//            while (l1 != l2) {
//                if (l1 != null && l2 != null) {
//                    l1 = l1.next;
//                    l2 = l2.next;
//                } else {
//                    return null;
//                }
//            }
//            return l1;
//        }
//    }
}
