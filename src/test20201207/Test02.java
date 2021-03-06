package test20201207;

import java.util.ArrayList;
import java.util.Random;

/*
public Solution(int[] nums) {
    给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。
    您可以假设给定的数字一定存在于数组中。
    注意：
    数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。
    示例:

    int[] nums = new int[] {1,2,3,3,3};
    Solution solution = new Solution(nums);

    // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
    solution.pick(3);

    // pick(1) 应该返回 0。因为只有nums[0]等于1。
    solution.pick(1);
 */
public class Test02 {
    public static void main(String[] args) {
        new Test02(new int[] {1,2,3,3,3}).pick(3);
    }
    private int[] nums;
    public Test02(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                list.add(i);
            }
        }
        int i = new Random().nextInt(list.size());
        System.out.println(list.get(i));
        return list.get(i);
    }
}
