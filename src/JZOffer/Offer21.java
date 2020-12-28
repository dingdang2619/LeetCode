package JZOffer;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
           if(nums[start]%2==1){
               start++;
               continue;
           }
           if(nums[end]%2==0){
               end--;
               continue;
            }
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
        }
        return nums;
    }
}
