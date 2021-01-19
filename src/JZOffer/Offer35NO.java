package JZOffer;

public class Offer35NO {
    public Node copyRandomList(Node head) {
        Node result = new Node(0);
        Node rTemp = result;
        while(head!=null && head.next!=null){
            rTemp.next = head.next;
            rTemp.val = head.val;
            rTemp.random = head.random;

            rTemp = rTemp.next;
            head = head.next;
        }
        return result;
    }
}
