package test20210112;

import JZOffer.ListNode;

/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Test04 {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur!=null){
            cur = cur.next;
            size++;
        }
        ListNode temp = head;
        for (int i = 0; i < size/2; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
