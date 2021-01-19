package josephus;

import JZOffer.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 约瑟夫问题是个有名的问题：N个人围成一圈，从第一个开始报数，第M个将被杀掉，最后剩下一个，其余人都将被杀掉。例如N=6，M=5，被杀掉的顺序是：5，4，6，2，3。
 * 分析：
 * （1）由于对于每个人只有死和活两种状态，因此可以用布尔型数组标记每个人的状态，可用true表示死，false表示活。
 * （2）开始时每个人都是活的，所以数组初值全部赋为false。
 * （3）模拟杀人过程，直到所有人都被杀死为止。
 */
public class Demo01 {
    public static void main(String[] args) {

    }

    //数组
    public List<Integer> josephus(int n, int m) {
        return null;


    }
//    public int[] josephus(int n, int m) {
//        boolean[] status = new boolean[n];
//        ListNode head = new ListNode();
//        ListNode cur = head;
//        for (int i = 0; i < n; i++) {
//            cur.next = new ListNode(i + 1);
//            cur = cur.next;
//        }
//        head = head.next;
//        cur.next = head;
//        cur = head;
//        while (head.next != null) {
//            for (int i = 0; i < m-1; i++) {
//                cur = cur.next;
//            }
//        }
//    }
}
