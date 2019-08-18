import java.util.Arrays;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/13
 **/
public class E_189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] clone = nums.clone();
        for (int i = 0; i < n; i++) {
            nums[i] = clone[(i + n - k) % n];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
