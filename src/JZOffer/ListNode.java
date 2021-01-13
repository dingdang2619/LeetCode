package JZOffer;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        String str = val + "->";
        if (next != null) {
            str += next.toString();
        }
        return str;
    }
}
