package JZOffer;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
        ListNode lastNode = head;
        ListNode tempNode = head;
        while(tempNode!=null){
            if(tempNode.val == val){
                lastNode.next = tempNode.next;
            }
            lastNode = tempNode;
            tempNode = tempNode.next;
        }
        return head;
    }
}
