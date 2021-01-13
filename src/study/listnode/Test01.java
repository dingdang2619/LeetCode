package study.listnode;

public class Test01 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        System.out.println(length(l1));


    }

    public static int length(ListNode listNode) {
        if (listNode == null) return 0;
        int size = 0;
        while (listNode != null) {
            size++;
            listNode = listNode.next;
        }
        return size;
    }

    public static ListNode reverse(ListNode head) {
        ListNode before = null;
        ListNode after = head;

        while(after!=null){
            ListNode temp = after.next;
            after.next = before;
            before = after;
            after = temp;
        }

        return after;
    }
}
