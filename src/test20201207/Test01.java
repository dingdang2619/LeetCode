package test20201207;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存
 * 在三个元素 a，b，c ，使得a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Test01 {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer[]> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                set.add(new Integer[]{nums[i], nums[left], nums[right]});
            }
            while (sum != 0) {

                while (right > left) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        set.add(new Integer[]{nums[i], nums[left], nums[right]});
                        break;
                    } else if (sum < 0) {
                        break;
                    }
                    right--;
                }
                if(-1 == (left == nums.length -1 ? -1 : left + 1)) break;
                right = nums.length-1;
            }
        }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (Integer[] integers : set) {
            lists.add(Arrays.asList(integers));
        }
        return lists;
    }
}
