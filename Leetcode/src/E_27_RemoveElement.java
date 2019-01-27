public class E_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int j = nums.length - 1;
        while (j >= 0 && nums[j] == val){
            j--;
        }
        if (j == -1){
            return 0;
        }
        for (int i = 0; i < j; i++) {
            if (nums[i] == val){
                nums[i] = nums[j];
                j--;
                while (j >= 0 && nums[j] == val){
                    j--;
                }
            }
        }
        return j+1;
    }

    public static void main(String[] args) {

    }
}
