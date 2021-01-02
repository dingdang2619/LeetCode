package JZOffer;

public class Offer24 {
    public ListNode reverseList(ListNode head) {

       ListNode before = null;
       ListNode after = head;
       while(after!=null){
           ListNode temp = after.next;
           after.next = before;
           before = after;
           after = temp;
       }

       return before;
    }

}
//1 2 3 4 5