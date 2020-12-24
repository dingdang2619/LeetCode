package JZOffer;

import java.util.Arrays;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(i != nums[i]){
                if(nums[i] == nums[nums[i]]) return nums[i];
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
//    public int findRepeatNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i] == nums[i+1]){
//                return nums[i];
//            }
//        }
//        return -1;
//    }
}
