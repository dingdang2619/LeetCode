package test20210120;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 *
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 注意：考虑存在两个及以上负数情况
 */
public class Test01 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int result1 = nums[size - 1] * nums[size - 2] * nums[size - 1];
        int result2 = nums[0] * nums[1] * nums[size - 3];
        return Math.max(result1, result2);
    }
}
