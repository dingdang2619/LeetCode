package JZOffer;

import java.util.LinkedList;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode letter = head, result = head;
        for (int i = 0; i < k; i++) {
            letter = letter.next;
        }
        while (letter!=null){
            letter = letter.next;
            result = result.next;
        }
        return result;
    }
}
