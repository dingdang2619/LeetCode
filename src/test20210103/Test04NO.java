package test20210103;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 超出时间限制 吐了
 */
public class Test04NO {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == k) return new int[]{maxInArr(nums)};
        int[] arr = new int[k];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            System.arraycopy(nums, i, arr, 0, k);
            result.add(maxInArr(arr));
        }
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }

    public int maxInArr(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}
