package test20210112;

import JZOffer.ListNode;

import java.util.Stack;

/**
 * 请判断一个链表是否为回文链表。
 */
public class Test03 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        while(!stack.isEmpty()){
            if(head.val != stack.pop().val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
