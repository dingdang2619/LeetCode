package test20210118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 41. 缺失的第一个正数
 * <p>
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * <p>
 * 进阶：你可以实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案吗？
 */
public class Test01 {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int i = 1;
        while(true){
            if(!set.contains(i)) return i;
            i++;
        }
    }
//    public int firstMissingPositive(int[] nums) {
//        if (nums.length == 0) return 1;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        int i = 1;
//        while(true){
//            if(!set.contains(i)) return i;
//            i++;
//        }
//    }

}
