package test20201221;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test02 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null) return null;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode cur = head;
        while(cur.next!= null){
            if(set.add(cur.next.val)){
                cur = cur.next;
            }else{
                cur.next = cur.next.next;
            }
        }
        cur.next = null;
        return head;
    }

}



