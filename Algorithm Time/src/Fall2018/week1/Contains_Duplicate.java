package Fall2018.week1;

import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        new Contains_Duplicate().run();
    }

    private void run() {

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() < nums.length;

    }
}
