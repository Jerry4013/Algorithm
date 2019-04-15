import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class E_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if(map.containsKey(left) && map.get(left) != i){
                return new int[]{map.get(left), i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        new E_1_TwoSum().run();
    }

    private void run() {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }



}
