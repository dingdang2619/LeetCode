package test20210112;

import JZOffer.ListNode;

import java.util.Stack;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class Test05 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != null) {
            stackA.push(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            stackB.push(l2);
            l2 = l2.next;
        }
        ListNode result = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            ListNode pop1 = stackA.pop();
            ListNode pop2 = stackB.pop();
            if (pop1 != pop2) {
                break;
            }
            result = pop1;
        }
        return result;
    }
}
