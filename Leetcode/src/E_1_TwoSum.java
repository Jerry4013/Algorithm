import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class E_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new E_1_TwoSum().run();
    }

    private void run() {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }



}
