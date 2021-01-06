package study.array_queue;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组模拟队列
 */
public class ArrayQueue {
    private int maxSize = 10;   //数组初始大小
    private int start;  //队列头（含）
    private int end;    //队列尾（含）
    private int[] queue = new int[maxSize];
    private int size;    //实际大小

    public int size() {
        return size;
    }

    public ArrayQueue() {
        end = -1;
        start = 0;
        size = 0;
    }

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        end = -1;
        start = 0;
        size = 0;
    }

    /**
     * 元素入队列前需判断是否超过数组大小
     *     如果超过则增大数组maxSize
     * @param n    添加的元素
     */
    public void add(int n) {
        if (end < maxSize - 1) {
            queue[++end] = n;
            size++;
        } else {
            maxSize *= 2;
            int[] newQueue = new int[maxSize];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;

            queue[++end] = n;
            size++;
        }
    }

    /**
     * 弹出后判断数组实际大小是否小于maxSize/2 如果小于 缩小数组大小 节省空间
     * @return  出队列的元素
     */
    public int pop() {
        if (size <= 0) {
            return -1;
        }
        int result = queue[start++];
        System.arraycopy(queue, 1, queue, 0, queue.length - 1);
        end--;
        size--;
        if (end < (maxSize / 2)) {
            int[] newQueue = new int[maxSize / 2];
            System.arraycopy(queue, 0, newQueue, 0, size);
            queue = newQueue;
        }

        return result;
    }

    public boolean isEmpry() {
        return size <= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(queue[i]).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
