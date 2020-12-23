package test20201221;

import java.util.HashSet;

public class Test03NO {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode cur = head;
        ListNode temp = new ListNode(0);
        while (cur.next != null) {
            ListNode l = cur.next;
            l.next = temp;
            temp = l;
            cur = cur.next;
        }
        while(cur!=null){
            if(cur.val != head.val){
                return false;
            }
            cur = cur.next;
            head = head.next;
        }
        return true;

    }
}

