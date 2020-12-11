package test20201211;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Test02 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
    public static StringBuilder nodeToString(ListNode l1){
        ListNode listNode;
        StringBuilder sb = new StringBuilder();
        if (l1 != null) sb.append(l1.val);
        while ((listNode = l1.next) != null) {
            sb.append(listNode.val);
            l1 = listNode;
        }
        return sb;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = nodeToString(l1);
        StringBuilder s2 = nodeToString(l2);
        s1.reverse();
        s2.reverse();
        Integer sum = Integer.valueOf(s1.toString())+Integer.valueOf(s2.toString());
        String sumStr = sum+"";
        char[] chars = sumStr.toCharArray();
        ListNode dad = new ListNode(Integer.valueOf(chars[0]+""));
        for (int i = 1; i < chars.length; i++) {
            dad = new ListNode( Integer.valueOf(chars[i]+""), dad);
        }
        return dad;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + "->" + next;
    }
}