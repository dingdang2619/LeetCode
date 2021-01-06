package JZOffer;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) i++;
            else if (sum > target) j--;
            else return new int[]{nums[i], nums[j]};
        }
        return null;
    }
}
