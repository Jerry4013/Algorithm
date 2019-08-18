/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/18
 **/
public class E_53_Maximum_SubArray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = (nums[i] + current > nums[i]) ? (nums[i] + current) : nums[i];
            max = (max > current) ? max : current;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);
        System.out.println("max = " + max);
    }
}
