package JZOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.append(head.val).append(' ');
            head = head.next;
        }
        if(sb.length() == 0)    return new int[0];
        return Arrays.stream(sb.reverse().substring(1).split(" ")).mapToInt(Integer::parseInt).toArray();
    }
//    //存入依次ArrayList 最后从后往前转为数组
//    public int[] reversePrint(ListNode head) {
//        ArrayList<Integer> list = new ArrayList<>();
//        while(head != null){
//            list.add(head.val);
//            head = head.next;
//        }
//        Collections.reverse(list);
//        int[] ints = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            ints[i] = list.get(i);
//        }
//        return ints;
//    }

//// 栈
//    public int[] reversePrint(ListNode head) {
//        int sum = 0;
//        Stack<Integer> s = new Stack<>();
//        while(head != null){
//            s.push(head.val);
//            sum++;
//            head = head.next;
//        }
//        int a[] = new int[sum];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = s.pop();
//        }
//        return a;
//    }
//}
}