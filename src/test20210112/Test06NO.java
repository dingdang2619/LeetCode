package test20210112;

import JZOffer.ListNode;

import java.util.ArrayList;

/**
 * 1290. 二进制链表转整数
 *
 * 给你一个单链表的引用结点head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 */
public class Test06NO {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while(cur != null){
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
